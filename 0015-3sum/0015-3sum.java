class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length;
       List<List<Integer>> ans = new ArrayList<>();
       
    

       //sort array : this curcial for the two pointers and for removinh duplicates
       Arrays.sort(nums);

       //interate through the array
       for(int i = 0; i<n; i++){
        //for removing duplicates
        if(i>0 && nums[i] == nums[i-1]) continue;

        //two pointers 
        int j= i+1;
        int k= n-1;

        //while loop
        while(j<k){
            int sum = nums[i] +nums[j] + nums[k];
            if(sum<0){
                j++;
            }else if(sum>0){
                k--;
            }else{
            //found triplets
            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
            ans.add(temp);

            //move pointers and skip duplicates
            j++;
            k--;

            while(j<k && nums[j] == nums[j-1]) j++;
            while(j<k && nums[k] == nums[k+1]) k--;

            }
        }
       }
        
       
       return ans;
    }
    
}