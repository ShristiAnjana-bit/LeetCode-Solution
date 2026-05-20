class Solution {
    public List<List<Integer>> threeSum(int[] nums){
       int n = nums.length;
       List<List<Integer>> ans = new ArrayList<>();

       //1.sort the array
       Arrays.sort(nums);

       //2. i for going throungh all the elements
       for(int i =0; i<n; i++){
        //. avoid duplicates
        if(i>0 && nums[i] == nums[i-1]) continue ;

      // 3 two pointers
      int j = i+1;
      int k = n-1;

      //4. while loop 
      while(j<k){
        int sum = nums[i] +nums[j] + nums[k];
        if(sum <0){
            j++;
        }else if(sum >0){
            k--;
        }else{
        //found a triplet
        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
        ans.add(temp);

        // move pointers and skip duplicates
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
    
