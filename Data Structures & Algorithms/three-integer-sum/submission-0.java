class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int iter = 0; iter < nums.length - 2; iter++) {
            if (iter > 0 && nums[iter] == nums[iter - 1]) {
                continue;
            }
            int left = iter + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[iter];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[left], nums[right], nums[iter]));

                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
