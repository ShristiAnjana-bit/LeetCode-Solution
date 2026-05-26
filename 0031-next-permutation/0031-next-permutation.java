class Solution {
    public void nextPermutation(int[] nums) {
       int n = nums.length;
       int bp= -1; // break point

       //step 1: find breakpoint
       for(int i =n-2; i>=0; i--){
        if(nums[i] < nums[i+1]){
            bp=i;
            break;
        }
       }
       //step 2: breakpoint found, swap
       if(bp != -1){
        for(int i = n-1; i>bp; i--){
            if(nums[i]>nums[bp]){
                //swap
                int temp = nums[i];
                nums[i] = nums[bp];
                nums[bp] = temp;
                break;
            }
        }
       }
       //step 3: reverse from bp+1 to end
       int left = bp+1;
       int right = n-1;
       while(left < right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
       }
    }
}
