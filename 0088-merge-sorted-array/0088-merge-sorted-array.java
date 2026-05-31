class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1= m-1; //last real elemnt in num1
        int p2= n-1; //last element in num2
        int p = m+n-1; //last slot is num1

        //stop only when nums2 is fully placed
        while(p2 >= 0){
            //if nums1 still has element AND its current is 
            if(p1 >= 0 && nums1[p1]> nums2[p2]){
                nums1[p] =nums1[p1];
                p1--;
            }else{
                //either nums1 is exhausted or nums 2[p2] is larger/equal
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        //if p2<0 , nums done - nums 1 remainder is already inplace
        
    }
}