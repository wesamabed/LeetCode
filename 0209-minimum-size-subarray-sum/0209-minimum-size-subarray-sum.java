class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            if(sum >= target){
                while(sum >= target){
                    sum -= nums[left];
                    min = Math.min(min, right - left + 1);
                    left++;
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}