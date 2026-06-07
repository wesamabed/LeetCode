class Solution {
    public boolean isPalindrome(String s) {
       if(s == null || s.length() == 0) return true;
       int right = s.length() - 1;
       int left = 0;
       while(right > left){
        while(right > left && !Character.isLetterOrDigit(s.charAt(right))) right--;
        while(right > left && !Character.isLetterOrDigit(s.charAt(left))) left++;
        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
        }
        right--;
        left++;
       }
       return true;
    }
}