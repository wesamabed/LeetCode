class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordOne = null;
        String wordTwo = null;
        for (int i = 0 ; i < word1.length ; i++) {
            wordOne += word1[i];
        }
        for (int j = 0 ; j < word2.length ; j++) {
            wordTwo += word2[j];
        }
        return wordOne.equals(wordTwo);
    }
}