class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        int right = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(!map.containsKey(c)){
                 map.put(c, right);
                 max = Math.max(max, right - left + 1);
                 right++;
            }
            else{
                left = Math.max(left, map.get(c) + 1);
                map.put(c, right);
                max = Math.max(max, right - left + 1);
                right++;
            }
        }
        return max;
    }
}