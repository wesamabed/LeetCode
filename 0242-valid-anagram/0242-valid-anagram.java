class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) return false;
        int[] anagram = new int[26];
        for(int i = 0; i < s.length(); i++){
            anagram[s.charAt(i) - 'a'] += 1;
        }
        for(char c : t.toCharArray()){
            if(anagram[c - 'a'] == 0) return false;
            anagram[c - 'a']--;
        }
        return true;
    }
}