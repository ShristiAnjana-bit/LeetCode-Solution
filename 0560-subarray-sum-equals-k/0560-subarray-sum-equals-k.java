class Solution {
    public int subarraySum(int[] nums, int k) {
      //this will store the total number of subarray that sum to k
      int count =0;
      //this tracks the running total as we move through the array
      int runningSum =0;
      //hashMap: Key = Prefix Sum,Value = how many times we've seen it
      HashMap<Integer,Integer> map = new HashMap<>();

      //1.The BASE CASE:
      //We've seen a sum of 0 once(this helps count subarray starting from index 0)
      map.put(0,1);
      for(int i =0; i<nums.length; i++){
        //2.Build: add the current number to our total
        runningSum += nums[i];

        //3: LOOK BACK: check for(current Total -target)
        //if it exist,it means the gap between that past sum and now is exactly k
        if(map.containsKey(runningSum-k)){
            count += map.get(runningSum-k);
        }
        //4: Record: Save our current total in the "Memory back"
        //we use getOrDefault to update to count if we've seen thsi sum before
        map.put(runningSum,map.getOrDefault(runningSum,0)+1);
      }
      return count;
    }
}