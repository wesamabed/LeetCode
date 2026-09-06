class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int max = 0;
        int currPrice = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] - currPrice > max) max = prices[i] - currPrice;
            if(prices[i] < currPrice) currPrice = prices[i];
        }
        return max;
    }
}