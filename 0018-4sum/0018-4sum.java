class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    int n = nums.length;
    List<List<Integer>> ans = new ArrayList<>();

    //1. sort the array to use the two pointer technique and skip duplicates[1,3]
    Arrays.sort(nums);

    for(int i=0; i<n; i++) {
        //2.skip duplicates for the first element i [4]
        if(i>0 && nums[i] == nums[i-1]) continue;

        for(int j=i+1; j<n; j++){
           // 3.skip duplicates for the seconfd element j[5]
            //only skip if it's not the first possible position for j (which is i+1)
            if(j>i+1 && nums[j] == nums[j-1]) continue;
        

        //4. initialise two pointers k amd l [5,6]
        int k = j+1;
        int l = n-1;

        while(k<l){
            //use long to prevent integer overflow when summing four numbers
            long sum= (long)nums[i]+nums[j]+nums[k]+nums[l];

            if(sum <target){
                //move k forward to increase the sum[8]
                k++;
            }else if(sum>target){
                //move l backward to decrease the sum[8]
                l--;
            }else{
                //5.found a quadruplet[9]
                List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                ans.add(temp);

                //move pointers and skip duplicates fork and l [1,9]
                k++;
                l--;
                while(k<l && nums[k] == nums[k-1]) k++;
                while(k<l && nums[l] == nums[l+1]) l--;
            }
        }
    }
    }
 return ans;
    }
}