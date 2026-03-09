class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if(strs == null || strs.length == 0) return list;
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] chars = new int[26];
            for(int i = 0; i < s.length(); i++){
                chars[s.charAt(i) - 'a'] += 1;
            }
            StringBuilder sb = new StringBuilder();
            for(int num: chars){
                sb.append(num);
                sb.append('#');
            }
            String key = sb.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        for(List<String> anag: map.values()){
            list.add(anag);
        }
        return list;
    }
}