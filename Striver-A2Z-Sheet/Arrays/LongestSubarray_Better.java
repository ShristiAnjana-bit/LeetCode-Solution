import java.util.HashMap;

public class Solution {
    public static int longestSubarrayWithSumK(int [] a, long k) {
        int n=a.length; //for range

        //key: Prefix Sum| Value: First where this sum occured 
        HashMap<Long,Integer>preSumMap = new HashMap<>();

        long sum =0; //running tool
        int maxLen =0; //the record total

      for(int i =0; i<n; i++){
          sum += a[i];

          //case 1: The sum from the very beginning is k
          if(sum == k){
              maxLen = Math.max(maxLen,i+1);

          }
          //case 2: check if(sum-k) exist in our "memory"
          long rem = sum-k;
          if(preSumMap.containsKey(rem)){
              int len = i-preSumMap.get(rem);
              maxLen = Math.max(maxLen,len);
          }
          //case 3: Only add to map if the sum is New
          //this keep the index as far LEFT as possible to get MAX length 
          if(!preSumMap.containsKey(sum)){
              preSumMap.put(sum,i);
          }
      }
      return maxLen;

    }
