class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(pile, right);
        }
        int result = right;
        while (left <= right) {
            int k = left + (right - left) / 2;
            long hours = 0;
            for (int pile : piles) {
                hours += (pile + k - 1) / k;
            }
            if (hours <= h) {
                result = k;
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return result;
    }
}
