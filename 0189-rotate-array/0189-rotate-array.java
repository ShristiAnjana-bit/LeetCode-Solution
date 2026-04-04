class Solution {
    public void rotate(int[] nums, int k) {
     int n= nums.length;
     if(nums == null || nums.length == 0){
        return ;  //if array is null(doesn't exist )and array is empty(doesn't have any element) return the value

     }
    //handle case where k>n
     k=k%n;
     if(k==0){
        return;
     }

    //step 1: reverse the first k elemts
    reverse(nums,0,n-1);

    //step 2: reverse the rest elements
    reverse(nums,0,k-1);

    //step3: reverse the all elements
    reverse(nums,k,n-1);
    }

    //helper function to swap the elements
    private void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

     
        
     
    }
