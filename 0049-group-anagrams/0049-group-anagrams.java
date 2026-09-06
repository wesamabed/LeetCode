class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs == null || strs.length == 0) return new ArrayList<>();;
       Map<String, List<String>> map = new HashMap<>();
       for(String str: strs){
        char[] count = new char[26];
        for(int i = 0; i < str.length(); i ++){
            count[str.charAt(i) - 'a']++;
        }
        String key = new String(count);
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
       }
       return new ArrayList<>(map.values());
    }
}