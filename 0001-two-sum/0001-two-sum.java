class Solution { // declares a class 
    public int[] twoSum(int[] nums, int target) { 
    int n = nums.length;

for(int i = 0; i<n; i++){
    for(int j= i+1; j<n;j++){
        if(nums[i]+nums[j]== target){
            return new int[] {i,j};
        }
    }
}
//if no solution is found , return an empty array (or as required)
return new int[] {};
     
        }
    
    }
