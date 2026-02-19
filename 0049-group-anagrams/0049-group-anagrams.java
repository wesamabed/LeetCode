class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            int [] count = new int[26];
            for (int i = 0 ; i < s.length(); i++){
                int index = s.charAt(i) - (int) 'a';
                count[index] += 1;
            }
            String key = claculateKey(count);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public String claculateKey(int[] count){
        StringBuilder st = new StringBuilder();
        for (int i = 0 ; i < count.length ; i++){
            st.append(count[i]).append('#');
        }
        return st.toString();

    }
}