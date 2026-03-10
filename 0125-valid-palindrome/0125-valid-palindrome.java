class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if((int) c >= 48 && (int) c <= 57){
                sb.append(c);
            }
            else if(c - 'a' >= 0 && c - 'a' <= 25){
                sb.append(c);
            }
        }
        String palindrome = sb.toString();
        int low = 0;
        int high = palindrome.length() - 1;
        while(low < high){
            if(palindrome.charAt(low) != palindrome.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}