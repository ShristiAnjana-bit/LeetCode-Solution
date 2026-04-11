class Solution {
    public void sortColors(int[] nums) {
       int low =0;
       int mid =0;
       int high = nums.length-1;

       while(mid <=high){
         if(nums[mid] ==0){
            //swap mid and low 
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid++;

         }else if(nums[mid] ==1){
            //already in middle ,just move 
            mid++;
         }else{ //nums[mid] ==2
         //swap mid and high
         int temp =nums[high];
         nums[high] = nums[mid];
         nums[mid] = temp;
         high--;
      //we don't increment mid here becouse the swapped element needs to be chaecked here

         }
       }
}
}