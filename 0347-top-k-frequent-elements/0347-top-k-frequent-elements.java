class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> bucket = new ArrayList<>(nums.length + 1);
        for(int i = 0; i < nums.length + 1; i++) bucket.add(new ArrayList<>());
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            bucket.get(value).add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for(int i = nums.length; i >= 0 && index < k; i--){
            for(int num: bucket.get(i)){
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}