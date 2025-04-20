class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i = 0, j = 0;
        int w1 = 0, w2 = 0;
        while (i < word1.length && j < word2.length) {
            if (word1[i].charAt(w1) != word2[j].charAt(w2)) {
                return false;
            }
            w1++;
            if (w1 == word1[i].length()) {
                w1 = 0 ;
                i ++;
            }
            w2++;
            if (w2 == word2[j].length()) {
                w2 = 0 ;
                j ++;
            }
        }
        return i == word1.length && j == word2.length;
    }
}