class Solution{
    public void sortColors(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length -1;

        while( mid <= high ){
            if(nums[mid]==0){
                //swap mid with low
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
// we will not swap because 1 is suppose to be 1 middle
             mid++;
            } 
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;

            }
            

        }
    }
}