// PS : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int minTillNow = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minTillNow) {
                minTillNow = prices[i];
            } else if((prices[i] - minTillNow) > maxProfit) {
                maxProfit = prices[i] - minTillNow;
            }
        }
        
        return maxProfit;
    }
}