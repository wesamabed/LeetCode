class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] memo = new int[nums.length + 1];
        int choiceA = nums[nums.length - 1] + calc(nums, memo, nums.length - 3);
        int choiceB = calc(nums, memo, nums.length - 2);
        return Math.max(choiceA, choiceB);

    }
    private int calc(int[] nums, int[] memo, int n){
        if(n < 0) return 0;
        if(nums[n] == 0) return 0;
        if(memo[n] != 0) return memo[n];
        int choiceA = nums[n] + calc(nums, memo, n - 2);
        int choiceB = calc(nums, memo, n - 1);
        memo[n] = Math.max(choiceA, choiceB);
        return memo[n];
    }
}