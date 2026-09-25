class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int iter = 0; iter < nums.length ; iter++){
            int need = target - nums[iter];
            if(map.containsKey(need)){
                return new int[]{map.get(need),iter};
            }
            map.put(nums[iter],iter);
        }
        return new int[]{};
    }
}
