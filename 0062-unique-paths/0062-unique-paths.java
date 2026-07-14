class Solution {
    public int solve(int i , int j, int[][] dp){
        
        //base case
        if(i==0 && j==0)
        return 1;

        //out of grid
        if(i < 0 || j < 0)
        return 0;

        //memoization 
        if(dp[i][j] != -1)
        return dp[i][j];

        //previous states
        int up = solve(i-1,j,dp);
        int left = solve(i,j-1,dp);

        //store answer
        dp[i][j] = up + left;

        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];
        for(int[] row:dp){
        Arrays.fill(row, -1); 
    }
        return solve(m-1,n-1,dp);

    }
}