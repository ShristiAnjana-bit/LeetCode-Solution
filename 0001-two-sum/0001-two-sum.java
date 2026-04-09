class Solution { // declares a class 
    public int[] twoSum(int[] nums, int target) { 
       Map<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i<nums.length; i++){
       int complement = target- nums[i];

        if( map.containsKey(complement)){
            return new  int[]{map.get(complement),i};
        }
        //if not found add current number yo map for future partners
        map.put(nums[i],i);
       }
       return new int[] {};
    
        }
    
    }

