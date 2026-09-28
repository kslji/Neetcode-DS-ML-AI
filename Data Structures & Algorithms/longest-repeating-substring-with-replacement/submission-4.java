class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int [26];
        int maxLength = 0;
        int maxFreq = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            count[index]++;
            maxFreq = Math.max(maxFreq, count[index]);

            int windowLength = right - left + 1;
            int replacement = windowLength - maxFreq;
            while (replacement > k) {
                count[s.charAt(left) - 'A']--;
                left++;

                windowLength = right - left + 1;
                replacement = windowLength - maxFreq;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
