class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if(strs == null || strs.length == 0) return list;
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
        for(String s: strs){
            Map<Character, Integer> subMap = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                subMap.put(s.charAt(i), subMap.getOrDefault(s.charAt(i), 0) + 1);
            }
            map.computeIfAbsent(subMap, k -> new ArrayList<>()).add(s);
        }
        for(List<String> anag: map.values()){
            list.add(anag);
        }
        return list;
    }
}