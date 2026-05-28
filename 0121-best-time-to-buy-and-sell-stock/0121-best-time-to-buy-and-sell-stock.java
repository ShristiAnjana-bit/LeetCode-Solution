class Solution {
    public int maxProfit(int[] prices) {
    int minPrices = prices[0]; //best buy price seen so far
    int maxProfit =0; // 0 beacuse not trading is valid

    for(int i =1; i<prices.length; i++){
        if(prices[i]<minPrices){
            minPrices = prices[i]; //found better buy day
        }else{
            //try sellinf today
            int profit = prices[i] -minPrices;
            maxProfit = Math.max(maxProfit,profit);
        }
    }
    return maxProfit;
    }

    
}