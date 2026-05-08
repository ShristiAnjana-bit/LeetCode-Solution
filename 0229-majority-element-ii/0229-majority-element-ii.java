class Solution {
    public List<Integer> majorityElement(int[] nums) {
    int n = nums.length;

    //list to store the final result
    List<Integer> ls = new ArrayList<>();

    //hashMao to remeber the count of each unique element
    Map<Integer,Integer>map = new HashMap<>();

    //minimum count needed for an element to be a majority element
    //(floor of n/3)+1
    int mini =(int)(n/3)+1;

    //single iteration over the array
    for(int i =0; i<n; i++){
        //update the count for the current element in the map
        int count = map.getOrDefault(nums[i],0) +1;
        map.put(nums[i],count);

        //check if the current element reaches the minimum threshold
        if(count == mini){
            ls.add(nums[i]);
        }
        //optimization: STOP IF WE HAVE ALREADY FOUND TWO MAJORITY ELEMENT
        if(ls.size() == 2){
            break;
        }
    }
    //Sort the result list as required by some platform
    Collections.sort(ls);
    return ls;
    }
}