class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);

        List<int[]> result =new ArrayList<>();
        result.add(intervals[0]); //seed with firt interval

        for(int i =1; i<intervals.length; i++){
            int[] current = intervals[i];
            int [] lastMerged = result.get(result.size()-1);

            if(current[0]<=lastMerged[1]){
                //overlap - extend end,keep the larger one
                lastMerged[1] = Math.max(lastMerged[1],current[1]);
            }else{
                //no overlap-add as new interval
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}