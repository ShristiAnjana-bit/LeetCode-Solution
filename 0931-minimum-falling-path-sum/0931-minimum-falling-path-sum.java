class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        //base case
        for(int j =0; j<n; j++){
            dp[m-1][j] = matrix[m-1][j];
        }
        for(int i= m-2; i >=0; i--){
            for(int j = 0; j<n; j++){
            int downLeft;
                if(j>0){
                    downLeft = dp[i+1][j-1];
                }else{
                    downLeft = Integer.MAX_VALUE;

                }
                int down = dp[i+1][j];

                int downRight;
                if(j<n-1){
                    downRight = dp[i+1][j+1];
                }else{
                    downRight = Integer.MAX_VALUE;
                }
                dp[i][j] = matrix[i][j] + Math.min(downLeft,Math.min(down,downRight));
            }
            
        }
        int ans = Integer.MAX_VALUE;
        for(int j =0; j<n; j++){
            ans = Math.min(ans,dp[0][j]);

        }
        return ans;
    }
}
           