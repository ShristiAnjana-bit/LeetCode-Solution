class Solution {
    public void moveZeroes(int[] nums) {
       int j=0; //this the gatekeeper ..j will stand at first were we have to put non zeros

       for(int i=0; i<nums.length;i++){ //loop through the array from starting
       if(nums[i]!=0){
    
        nums[j] = nums[i]; //first ,put the person in the chair
        j++; //then,move the 'next chair' pointer forward
       }
       }

       while(j<nums.length){
        nums[j] =0;
        j++;
       }

       


        
    }
}