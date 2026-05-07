class Solution {
    public List<Integer> majorityElement(int[] nums) {
      int n = nums.length;

      //list to store the result,initially empty[2]  
      List<Integer> ls = new ArrayList<>();

      for(int i =0; i<n; i++){
        //check if the current element is already in our list to avoid redundant check[1,3]
        if(ls.size()==0 || ls.get(0)!=nums[i]){
            int count =0;

            //travers the entire array to count occurrence of nums[i] [3]
            for(int j=0; j<n; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            //if count is greater than floor (n/3) add it to the list(3)
            if(count >(n/3)){
                ls.add(nums[i]);
            }
        }
        //at most there can only be two element appearing 
        //if we found two,we cantop the iteration
        if(ls.size()==2){
            break;
        }
      }
      return ls;
    }
}