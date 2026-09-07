class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int count = nums.length / 2;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > count) return entry.getKey();
        }
        return -1;
    }
}