class Solution {
    public boolean validPalindrome(String s) {
        if(s == null) return false;
        int low = 0;
        int high = s.length() - 1;
        while(low < high){
            char l = s.charAt(low);
            char h = s.charAt(high);
            if(l != h){
                return isPalindrome(s, low+1, high) || isPalindrome(s, low, high-1);
            }
            low++;
            high--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int low, int high){
        while(low < high){
            char l = s.charAt(low);
            char h = s.charAt(high);
            if(l != h) return false;
            low++;
            high--;
        }
        return true;
    }
}