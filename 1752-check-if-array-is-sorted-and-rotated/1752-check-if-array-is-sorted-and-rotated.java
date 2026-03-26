class Solution {
    public boolean check(int[] nums) {
        int count =0;
        int n= nums.length;

        for(int i=0;i<n;i++){
            //check current element with the NEXT element
            //we use(i+1)%n to loop back to the start at the end
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
            //optimization:if we find more than 1 break fail easily
            if(count>1) return false;
        }
        //if there's more than one break,it's not sorted /rotated array
        return true;
        
    }
}