class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                left = Math.max(left, map.get(c));
            }
            map.put(c, right + 1);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}