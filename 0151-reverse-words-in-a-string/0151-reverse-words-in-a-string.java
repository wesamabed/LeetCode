class Solution {
    public String reverseWords(String s) {
        if(s.length() == 0 || s == null) return "";
        StringBuilder str = new StringBuilder();
        int i = s.length() - 1;
        while(i >= 0){
            while(i >= 0 && s.charAt(i) == ' ') i--;
            if(i < 0) break;
            int end = i;
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            if(str.length() > 0) str.append(' ');
            str.append(s.substring(i + 1, end + 1));
        }
        return str.toString();
    }
}