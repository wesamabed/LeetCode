class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        List<List<Integer>> result = new ArrayList<>(k);
        if(nums1.length == 0 || nums2.length == 0) return result;
        for(int i = 0; i < Math.min(k, nums1.length); i++){
            minHeap.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }
        while(!minHeap.isEmpty()){
            if(result.size() >= k) return result;
            int [] curr = minHeap.poll();
            result.add(Arrays.asList(nums1[curr[1]], nums2[curr[2]]));
            if(curr[2] + 1 < nums2.length){
            minHeap.offer(new int[]{nums1[curr[1]] + nums2[curr[2] + 1], curr[1], curr[2] + 1});
            }
        } 
        return result;
    }
}