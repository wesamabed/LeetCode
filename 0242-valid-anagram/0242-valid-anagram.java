class Solution {
    public boolean isAnagram(String s, String t) {
       char[] stringOne = s.toCharArray();
       char[] stringTwo = t.toCharArray();
       Arrays.sort(stringOne);
       Arrays.sort(stringTwo);
       return Arrays.equals(stringOne, stringTwo);

    }
}