class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int left = 0; 
        int right = 0; 
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        while (right < s.length()) {
            char c = s.charAt(right);
            
            if (map.containsKey(c)) {
                // If we've seen it, jump 'left' to the right of the old position
                left = Math.max(left, map.get(c) + 1);
            }
            
            // ALWAYS update the map with the newest position
            map.put(c, right);
            
            // ALWAYS move right forward
            right++;
            
            // Calculate max (using your 'right' logic which is already 1-step ahead)
            max = Math.max(max, right - left);
        }
        return max;
    }
}