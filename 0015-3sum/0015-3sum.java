class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans= new ArrayList<>();
       //1.first we will sort the array
       Arrays.sort(nums);

       //2.we will iterate throught the array
       for(int i =0; i<n; i++){
        //for avoiding duplicates
        if(i>0 && nums[i] == nums[i-1]) continue;

        //now we will use two pointers
        int j = i+1;
        int k = n-1;

        //now we will use while loop 
        while(j<k){
            int sum = nums[i] +nums[j] +nums[k];
            if(sum<0){
                j++;
            }else if(sum>0){
                k--;
            }else{
                //found triplets
                List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                ans.add(temp);

                //move pointers and remove duplicates
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