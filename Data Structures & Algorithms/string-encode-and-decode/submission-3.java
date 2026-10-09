class Solution {
    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for (String character : strs) {
            str.append(character.length()).append('#').append(character);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int iter =0;
        while(iter < str.length()){
            int j = iter;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(iter , j));
            j++;
            String word = str.substring(j , j + length);
            list.add(word);
            iter = j + length;
        }
        return list;
    }
}
