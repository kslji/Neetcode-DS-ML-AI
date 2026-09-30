class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int[] need = new int[128];
        int[] window = new int[128];

        int required = 0;

        for (char ch : t.toCharArray()) {
            if (need[ch] == 0) {
                required++;
            }
            need[ch]++;
        }

        int left = 0;
        int have = 0;
        int minlength = Integer.MAX_VALUE;
        int minLeft = 0;

        for (int right = 0; right < s.length(); right++) {
            int c = s.charAt(right);
            window[c]++;
            if (need[c] > 0 && window[c] == need[c]) {
                have++;
            }

            while (have == required) {
                int windowLength = right - left + 1;
                if (windowLength < minlength) {
                    minlength = windowLength;
                    minLeft = left;
                }
                char leftChar = s.charAt(left);
                window[leftChar]--;
                if (need[leftChar] > 0 && window[leftChar] < need[leftChar]) {
                    have--;
                }
                left++;
            }
        }
        if(minlength == Integer.MAX_VALUE ){
            return "";
        }
        return s.substring(minLeft , minLeft + minlength);
    }
}
