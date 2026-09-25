class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int iter = 0; iter < nums.length; iter++) {
            if (map.contains(nums[iter])) {
                return true;
            }
            map.add(nums[iter]);
        }
        return false;
    }
}