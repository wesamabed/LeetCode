class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> list = new ArrayList<>();
       if(strs == null || strs.length == 0) return list;
       Map<String, List<String>> map = new HashMap<>();
       for(int i = 0 ; i < strs.length; i++){
        int[] charIndex = new int[26];
        for(int j = 0; j < strs[i].length(); j++){
            charIndex[strs[i].charAt(j) - 'a']++;
        }
        String key = Arrays.toString(charIndex);
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
       }
       return new ArrayList<>(map.values());
    }
}