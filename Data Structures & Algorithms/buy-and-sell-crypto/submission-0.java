class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int iter = 1 ; iter < prices.length ; iter++){
            int profit = prices[iter] - minPrice;
            maxProfit = Math.max(maxProfit , profit);
            minPrice = Math.min(minPrice,prices[iter]);
        }
        return maxProfit;
    }
}
