class Solution {
    public boolean isPalindrome(String s) {
       if(s == null || s.length() == 0) return true;
       StringBuilder sb = new StringBuilder();
       s = s.toLowerCase();
       for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if(Character.isLetter(c) || Character.isDigit(c)) sb.append(c);;
       }
       int left = 0;
       int right = sb.length() - 1;
       while(right >= left){
        if(sb.charAt(right) != sb.charAt(left)) return false;
        right--;
        left++;
       }
       return true;
    }
}