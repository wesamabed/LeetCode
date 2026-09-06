class Solution {
    public boolean isPalindrome(String s) {
       if(s.length() < 2) return true;
       int left = 0;
       int right = s.length() - 1;
       while(left < right){
        char leftChar = s.charAt(left);
        char rightChar = s.charAt(right);
        if(!Character.isLetterOrDigit(leftChar)){
            left ++;
            continue;
        }
        if(!Character.isLetterOrDigit(rightChar)){
            right --;
            continue;
        }
        if(Character.toLowerCase(rightChar) != Character.toLowerCase(leftChar)) return false;
        left ++;
        right --;
       }
       return true;
    }
}