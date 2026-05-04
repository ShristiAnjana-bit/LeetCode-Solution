class Solution {
    public int subarraySum(int[] nums, int k) {
       int count =0;

       //i is the starting of the subarray
       for(int i=0; i<nums.length; i++){
        int currentSum =0;

        //j is the end of the subarray
        for(int j=i; j<nums.length; j++){
            currentSum += nums[j];  //add the current element to the sum
            //check of the sum of the subarray from i to j equal k
            if(currentSum == k){
                count++;
            }
        }
       }
       return count;
    }
}