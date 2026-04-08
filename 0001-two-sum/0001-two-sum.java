class Solution { // declares a class 
    public int[] twoSum(int[] nums, int target) { 
      
      //map to store the keys and values
      Map<Integer,Integer> map = new HashMap<>();

      for(int i =0; i<nums.length; i++){
        int complement = target - nums[i];

//check if partner is in the map
        if(map.containsKey(complement)){
            //return the index of the partner and current index
            return new int[] {map.get(complement),i};
        }
            //if not found, add current number to map for future partners
            map.put(nums[i],i);
        
      }
      return new int[] {};
        }
    
    }
