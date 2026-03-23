class Solution {
    public int singleNumber(int[] nums) {
        int n= nums.length;  // to know about the range

        //pick each number one by one
        for(int i =0;i<n;i++){
            int num = nums[i];
            int count =0;

            //check every other number in the array
            for(int j =0; j<n; j++){
                if(nums[j] == num){
                    count++;
                }
            }
            //if we only saw the number once, it's the lone survivor
            if(count == 1){
                return num;
            }
        }
        return -1;

    }
}