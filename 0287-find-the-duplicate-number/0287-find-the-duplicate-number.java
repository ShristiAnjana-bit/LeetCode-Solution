class Solution {
    public int findDuplicate(int[] nums) {
      // phase 1: detect cycle --find meeting point
      int slow = nums[0];
      int fast = nums[nums[0]];

     while(slow!=fast){
        slow = nums[slow];    //one step
        fast = nums[nums[fast]];   //two step

     }
     //phase 2: find cycle entrance = duplicate number
     slow =0;
     while(slow!=fast){
        slow = nums[slow];
        fast = nums[fast];
     }
     return slow;
    

    }
}