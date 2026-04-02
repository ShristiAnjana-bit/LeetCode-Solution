class Solution {
    public int removeDuplicates(int[] nums) {
     int i =0; //i is in index0 and it is repesenting last unique element 

     for(int j= 1; j<nums.length; j++){ //it will loop through the whole array starting from the 1 
     if(nums[j]!=nums[i]){
        i++;
        nums[i] = nums[j];
     }
     }
    return i+1; //it will give the total unique element the we found
     }
    
}