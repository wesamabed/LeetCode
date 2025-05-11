class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] - minprice > max) max = prices[i] - minprice;
            if (prices[i] < minprice) minprice = prices[i];
        }
        return max;
    }
}