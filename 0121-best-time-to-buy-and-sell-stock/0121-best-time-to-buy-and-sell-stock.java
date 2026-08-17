class Solution {
    public int maxProfit(int[] prices) {

            int min = prices[0];
            int profit = 0;
            int maxp = 0;
            int ind = 0;
        
        for(int i = 0; i < prices.length; i++){
            profit = prices[i] - min;
    
            if(profit > maxp){
                maxp = profit;
            } 
            if(prices[i] < min){
                 min = prices[i];
                 ind = i;
            }
        }

            if(ind == prices.length){
                return 0;
            }
        return maxp;
    }

}