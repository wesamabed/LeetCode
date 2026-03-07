class Solution {
    public int climbStairs(int n) {
        int[] steps = new int[n + 1];
        if(n <= 1) return n;
        return calc(n, steps);
    }
    private int calc(int n, int[] steps){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(steps[n] != 0) return steps[n];
        steps[n] = calc(n - 1, steps) + calc(n - 2, steps);
        return steps[n];
    }
}