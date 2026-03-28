class Solution {
    public void rotate(int[] nums, int k) {
      int n = nums.length;
      k = k%n ;//always do this !if k=10 and n = 7...(10-7=3). you only rotate 3 times

      //step 1: copy last k element into the temp array
      int[] temp = new int[k];
     for(int i =0; i<k; i++){
        temp[i] = nums[n-k+i];
     }
        //step2: Shieft the rest of the array to the right
        //crucial: go backward so you don't lose data!
        for(int i = n-k-1; i>=0; i--){
            nums[i+k] = nums[i];

        }
        //step3: put the temp element back at the start 
        for(int i=0; i<k; i++){
            nums[i] = temp[i];
        }

    
     }
    }
