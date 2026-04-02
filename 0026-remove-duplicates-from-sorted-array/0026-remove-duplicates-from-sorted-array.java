class Solution {
    public int removeDuplicates(int[] nums) {
       int i =0; //starts at index 0 and will have last unique element

       for(int j=1; j< nums.length; j++){ //loop through the whole array startin from the index 1
       if(nums [j] != nums [i]){
        i++; //if i and j are not equal then we update i
        nums[i] = nums[j]; // put the new number there
    
       }
       }
     return i+1;
       }
    
}