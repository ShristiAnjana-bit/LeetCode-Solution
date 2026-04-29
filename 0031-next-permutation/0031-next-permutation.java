class Solution {
    public void nextPermutation(int[] nums) {
       int n= nums.length;

       //step 1: find the breakpoint (the dip in mountain) 
       int i = n-2;
       while(i>=0 && nums[i]>=nums[i+1]){
        i--;
       }
       //if i becomes -1 , it means the array is sorted in decreasing order (eg 3,2,1)
       //if i>=0 we found a breakpoint!
     if(i >=0){
        //step 2: Find the number "slightly greater" than nums[i] from the right
        int j = n-1;
        while(nums[j] <= nums[i]){
            j--;
        }
        //swap the breakpoint with this slightly large number
        swap(nums,i,j);

     }
     //step 3: reverse the tail (everything to the right of the breakpoint)
     reverse(nums,i+1,n-1);
    }
    //helper method to swap elements
    private void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[]nums,int start,int end){
        while(start <end){
            swap(nums,start++,end--);
        }
    }
}
