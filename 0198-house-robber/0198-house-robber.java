class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return computeMaxProfit(nums, memo, nums.length - 1);
    }
    private int computeMaxProfit(int[] nums, int[] memo, int n){
        if(n < 0) return 0;
        if(n == 0) return nums[0];
        if(memo[n] != -1) return memo[n];
        int rop = nums[n] + computeMaxProfit(nums, memo, n - 2);
        int skip = computeMaxProfit(nums, memo, n - 1);
        memo[n] = Math.max(rop, skip);
        return memo[n];
    }
}