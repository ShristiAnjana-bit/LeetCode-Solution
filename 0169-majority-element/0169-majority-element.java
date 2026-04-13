class Solution {
    public int majorityElement(int[] nums) {
      int n = nums.length;

      //outer loop : picks each element one by one
      for(int i =0; i<n; i++){
        int count =0;
        int candidate = nums[i];

        //inner loop: count how many times "candidate" appears in the whole array
        for(int j=0; j<n; j++){
            if(nums[j] == candidate){
                count++;
            }
        }
        //if the count is more than n/2 , we found our winner!
        if(count > n/2){
            return candidate;
        }
      }
      return -1;
    }
}