class Solution { // declares a class 
    public int[] twoSum(int[] nums, int target) { 

        //create memory (hashmap)
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            int complement = target-nums[i];
            // the missing piece

            //if we have seen the complement before return the indices
            if(map.containsKey (complement)){
                return new int[] {
                    map.get(complement),i};
                }
                //otherwise , store the current number and its index
                map.put(nums[i],i);
            }
            return new int[]{}; // return empty if no solution
        }
    
    }
