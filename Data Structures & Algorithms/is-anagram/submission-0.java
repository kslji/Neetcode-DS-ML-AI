class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] character= new int[26];
        for(int iter = 0 ; iter < s.length() ; iter++){
            character[s.charAt(iter)-'a']++;
            character[t.charAt(iter)-'a']--;
        }
        for(int val : character){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}
