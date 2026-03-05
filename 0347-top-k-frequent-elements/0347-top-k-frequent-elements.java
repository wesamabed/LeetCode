class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> bucket = new ArrayList<>(nums.length + 1);
        for(int i = 0; i < nums.length + 1; i++) bucket.add(i, new ArrayList<>());
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            bucket.get(value).add(key);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = nums.length; i >= 0; i--){
            if(result.size() >= k) break;
            if(bucket.get(i).isEmpty()) continue;
            result.addAll(bucket.get(i));
        }
        int[] topK = new int[k];
        for(int i = 0; i < k; i++){
            topK[i] = result.get(i);
        }
        return topK;
    }
}