class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for (String s : strs){
            char [] chars = s.toCharArray();
            List<Integer> count = new ArrayList<>(Collections.nCopies(26, 0));
            for (char c : chars){
                int index = c - (int) 'a';
                count.set(index, count.get(index) + 1);

            }
            map.computeIfAbsent(count, c -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());

    }
}