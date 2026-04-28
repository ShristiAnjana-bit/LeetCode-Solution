class Solution {
    public int maxSubArray(int[] nums) {
    
     int maxSum = nums[0];
     int currentSum =0;

     for(int i =0; i <nums.length; i++){
        //step 1: add current element to our running total 
        currentSum += nums[i];

        //step 2: if we found a new high record, save it
        if(currentSum > maxSum){
            maxSum = currentSum;
        }

        //step 3: if the sum is negative ,it's useless for 
        //future sunarrays , rest it to zero
        if (currentSum <0){
            currentSum =0;
        }
     }
     return maxSum;

     
    }
}