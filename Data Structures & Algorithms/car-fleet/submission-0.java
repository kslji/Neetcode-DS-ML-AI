class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        int[][] cars = new int[n][2];

        for (int iter = 0; iter < n; iter++) {
            cars[iter][0] = position[iter];
            cars[iter][1] = speed[iter];
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stk = new Stack<>();
        for (int iter = 0; iter < n; iter++) {
            int pos = cars[iter][0];
            int spd = cars[iter][1];

            Double time = (double) (target - pos)/ spd;
            if(stk.isEmpty() || time > stk.peek()){
                stk.push(time);
            }
        }
        return stk.size();
    }
}
