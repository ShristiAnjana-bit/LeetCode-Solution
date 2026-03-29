class Solution {
    public void rotate(int[] nums, int k) {
     int n= nums.length;
     k=k%n; //the "Golden rule" for rotation 

     //step 1: Reverse the whole array
     //[1,2,3,4,5] - [5,4,3,2,1]
     reverse(nums,0,n-1);

     //step2 : reverse the first k element
     //[5,4,3,2,1]  - [4,5 ,3,2,1] (if k=2)
     reverse(nums,0,k-1);

     //step3: Reverse the rest
     //[4,5,3,2,1] - [4,5,1,2,3
     reverse(nums,k,n-1);
    
     }
     //helper function the swap element
     private void reverse(int[] nums,int start,int end){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
     
    }
}