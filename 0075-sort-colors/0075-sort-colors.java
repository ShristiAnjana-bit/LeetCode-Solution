class Solution {
    public void sortColors(int[] nums) {
      int low = 0;
      int mid =0;
      int high = nums.length-1;

      while(mid<=high){
        if(nums[mid] == 0){
            //swap mid with low
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            mid++;
            low++;
        }else if(nums[mid]== 1){
            // mid value can be 1 so no need to swap anything
            mid++;
        }else{
            int temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
            
        }

      }
}
}