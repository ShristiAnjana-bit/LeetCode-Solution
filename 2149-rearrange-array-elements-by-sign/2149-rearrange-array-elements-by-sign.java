class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        //step 1: create two lists to store numbers separately
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        //step 2: fill the lists (0(n) times)
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                pos.add(nums[i]);
                }else{
                    neg.add(nums[i]);
                }
        }
        //step 3: put them back into the array in alternating order 0(n) time
        for(int i =0; i<n/2;i++){
            //positive go to even indices:0,2,4
            nums[2*i] = pos.get(i);
            //-ve go to odd indices : 1,3,4
            nums[2*i+1] = neg.get(i);

        }
        return nums;

    }
}