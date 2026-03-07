class Solution {
    public int fib(int n) {
        int[] memo = new int [n + 1];
        if(n <= 1) return n;
        memo[1] = 1;
        return calc(n, memo);
    }
    private int calc(int n, int[] memo){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int fib = calc(n - 1, memo) + calc(n - 2, memo);
        memo[n] = fib;
        return fib;
    }
}