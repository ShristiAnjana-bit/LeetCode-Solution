class Solution {
    public int majorityElement(int[] nums) {
      int candidate =0;
      int count =0;

      for(int num: nums){
        //1.if the throne is empty ,take it!
        if(count ==0){
        candidate = num;
      }

      //2.if you are the same tribe,count goes up 
      //if different, you both get knocked out(count goes down)
      if(num == candidate){
        count++;
      }else{
        count--;
      }

    }
    // the person left standing is the majority element
    return candidate;
}   
}