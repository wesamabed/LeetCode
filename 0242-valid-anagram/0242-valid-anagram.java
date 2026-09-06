class Solution {
    public boolean isAnagram(String s, String t) {
       int[] stringOne = new int[26];
       int[] stringTwo = new int[26];
       for(int i = 0; i < s.length(); i++){
        stringOne[s.charAt(i) - 'a'] ++;
       }
       for(int i = 0; i < t.length(); i++){
        stringTwo[t.charAt(i) - 'a'] ++;
       }
       return Arrays.equals(stringOne, stringTwo);
    }
}