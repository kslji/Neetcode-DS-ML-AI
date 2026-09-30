class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] ch1 = new int[26];
        int[] ch2 = new int[26];

        for (char ch : s1.toCharArray()) {
            ch1[ch - 'a']++;
        }
        int windowsize = s1.length();
        for (int iter = 0; iter < windowsize; iter++) {
            ch2[s2.charAt(iter) - 'a']++;
        }

        if (match(ch1, ch2)) {
            return true;
        }

        for (int right = windowsize; right < s2.length(); right++) {
            ch2[s2.charAt(right) - 'a']++;
            int left = right - windowsize;
            ch2[s2.charAt(left) - 'a']--;
            if (match(ch1, ch2)) {
                return true;
            }
        }
        return false;
    }
    public boolean match(int[] ch1, int[] ch2) {
        for (int iter = 0; iter < 26; iter++) {
            if (ch1[iter] != ch2[iter]) {
                return false;
            }
        }
        return true;
    }
}
