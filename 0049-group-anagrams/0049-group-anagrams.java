class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int[] charCounter = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                charCounter[strs[i].charAt(j) - 'a']++;
            }
            String key = Arrays.toString(charCounter);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}