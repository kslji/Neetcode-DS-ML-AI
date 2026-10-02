class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> stk = new Stack<>();
        for(int temp =0;temp <  temperatures.length ; temp++){
            while(!stk.isEmpty() && 
            temperatures[temp] > temperatures[stk.peek()]){
                int index = stk.pop();
                result[index] = temp - index;
            }
            stk.push(temp);
        }
        return result;
    }
}
