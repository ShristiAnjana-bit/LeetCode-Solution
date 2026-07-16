import java.util.Arrays;
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         int m = obstacleGrid.length;
         int n = obstacleGrid[0].length;

         int[][] dp = new int[m][n];

         //fill the table from bottom right to top left
         for(int i = m-1; i >= 0; i--){
            for(int j =n-1; j>=0; j--){
        
        //obstacle 
        if (obstacleGrid[i][j] == 1){
            dp[i][j] = 0;

        }
        //Destination 
        else if (i == m-1 && j == n-1){
            dp[i][j] =1;

        }
        else {
            int right = 0;
            int down =0;

            if(j+1 <n){
                right = dp[i][j+1];

            }
            if(i+1 <m){
                down = dp[i+1][j];
            }
            dp[i][j] = right + down;
        }
            }
         }
         return dp[0][0];

    }
}