class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // the new array we are filling 

        int posIndex =0; // next avilable seat for a +ve number
        int negIndex = 1; // next available seat for a -ve number

        for(int i =0; i<n; i++){
            //if the current number is +ve
            if(nums[i] >0){
                result[posIndex] = nums[i]; //put it in the next eeven seat
                posIndex += 2;
            }
            //if the current number is -ve
            else{
                result[negIndex] = nums[i]; //put it in a next odd seat
                negIndex +=2;
            }
        }
         return result;
    }
}