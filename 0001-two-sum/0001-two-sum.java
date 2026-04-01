class Solution { // declares a class 
    public int[] twoSum(int[] nums, int target) { // method called two sum
        //int is the return type = array of integer(the two indices).
        //(int[] nums, int target) = targets = num- array of integer given a problem
        // target - the number we want to form by adding two elements

        for(int i = 0; i<nums.length;i++){  // int i = 0 -- start from index 0 , 
                                            //i < nums.length --loop until the last element
                                            // i++ -- increase i by 1 each time so this loop  
                                            // i go through every index of the array
        for(int j = i+1; j<nums.length;j++){  // start from the element after i.
                                             // we don't start at 0 , because we don't want to use the same number twice
                                             // j<nums.length loop until the end of the arry
                                             // j++ move to the next index
     if(nums[i]+ nums[j]== target){
        return new int[] {i,j};
     }
        }                                    

        }
        return new int[] {}; 
    }
}