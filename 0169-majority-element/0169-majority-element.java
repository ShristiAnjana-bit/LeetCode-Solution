class Solution {
    public int majorityElement(int[] nums) {
      int n = nums.length;

      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i= 0; i<nums.length; i++){
        int num = nums[i]; //traversing through the arrAY

        // Get current count(default to 0) and add1
        map.put(num,map.getOrDefault(num,0)+1);

        //check if this number is now the mejority
        if(map.get(num)>n/2){
            return num;
        }

      }
      return -1;

    }
}