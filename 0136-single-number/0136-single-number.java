class Solution {
    public int singleNumber(int[] nums) {
        //Step 1: Create the "TALLY SHEET"
        HashMap<Integer,Integer>map= new HashMap<>();

        //Step 2: Fill the tally sheet
        for(int i =0; i <nums.length; i++){
            int num = nums[i];
            //if it's already in the map ,add 1 if not,Start at 0 and add 1.
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //step 3: Find the number with a count of 1 
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
       return -1;
    }
}