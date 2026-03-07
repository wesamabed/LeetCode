class Solution {
    public int climbStairs(int n) {
        if( n == 0 ) return 0;
        if(n == 1) return 1;
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        return calculateSteps(memo, n);
    }
    private int calculateSteps(int[] memo, int n){
        if(n <= 0) return 0;
        if(memo[n] != 0) return memo[n];
        memo[n] = calculateSteps(memo, n - 1) + calculateSteps(memo, n - 2);
        return memo[n];
    }
}