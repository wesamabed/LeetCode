class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null || s.length() == 0) return 0;
        int temp = k; int max = 0; int left = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        for(int right = 0; right < s.length(); right++){
            int c = s.charAt(right) - 'A';
            freq[c] += 1;
            maxFreq = Math.max(maxFreq, freq[c]);
            if((right - left + 1) - maxFreq > k){
                while((right - left + 1) - maxFreq > k){
                    freq[s.charAt(left) - 'A']--;
                    left ++;
                }
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}