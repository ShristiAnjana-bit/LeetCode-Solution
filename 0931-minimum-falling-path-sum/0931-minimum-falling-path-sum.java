class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] prev = new int[n];

        for(int j =0; j<n; j++){
            prev[j] = matrix[m-1][j];
        }
         
        for(int i = m-2; i>=0; i--){
            int[] curr = new int[n];
            for(int j =0; j<n; j++){
                int downLeft;
                if(j>0){
                    downLeft = prev[j-1];
                }else{
                    downLeft = Integer.MAX_VALUE;
                }
                int down = prev[j];
                int downRight;
                if(j<n-1){
                    downRight = prev[j+1];
                }else{
                    downRight = Integer.MAX_VALUE;
                }
                 curr[j] = matrix[i][j] + Math.min(downLeft,Math.min(down,downRight));
            }
            prev = curr;
        }
        

        int ans = Integer.MAX_VALUE;
        for(int j =0; j<n; j++){
            ans = Math.min(ans,prev[j]);
        }

     return ans;   
    }
}
           