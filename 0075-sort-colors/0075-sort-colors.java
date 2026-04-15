class Solution {
    public void sortColors(int[] nums) {
        int low =0;
        int mid = 0;
        int high = nums.length - 1;

     while(mid<=high){
        if(nums[mid] ==0){
            //swap the value with low
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid++;
        }
     else if(nums[mid] == 1){
            //1 can be in mid so no need to swap
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
