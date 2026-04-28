class Solution {
    public int maxProfit(int[] prices) {
     //initilize minPrice as a very large number so the first price becomes the new min
     int minPrice = Integer.MAX_VALUE;
     int maxProfit =0;

     for(int i = 0; i<prices.length; i++){
        //update the min price seen so far
        if(prices[i]<minPrice){
            minPrice = prices[i];
        }
        //calculate potential profit if we sold today
        //and compare it with the best profit we've seen so far
        else if (prices[i] - minPrice > maxProfit){
            maxProfit = prices[i] - minPrice;
        }
     }   
     return maxProfit;
    }

    
}