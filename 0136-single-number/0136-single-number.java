class Solution {
    public int singleNumber(int[] nums) {
        //step 1.store the length to keep the code clean
        int n = nums.length;

        //step2. initialize the 'magic eraser' at 0 
        int xor=0;
        
        //step 3. loop to check every number in the array excatly once
        for(int i=0;i<n;i++){

            //step 4. the twin will eventually find and erase each other 
            xor=xor^nums[i];
        }
        //step 5. the only survivor is the number without twin
        return xor;

    }
}