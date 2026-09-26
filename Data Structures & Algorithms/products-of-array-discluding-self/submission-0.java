class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int left = 1;
        for(int iter = 0 ; iter < nums.length ; iter++){
            output[iter] = left;
            left = left * nums[iter];
        }
        int right =1;
        for(int j = nums.length-1 ; j >= 0 ; j--){
            output[j] = output[j] * right;
            right = right * nums[j];
        }
        return output;
    }
}  
