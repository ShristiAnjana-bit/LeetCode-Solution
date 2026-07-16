import java.util.Arrays;
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         int m = obstacleGrid.length;
         int n = obstacleGrid[0].length;

         int[] prev = new int[n];

         for(int i = m-1; i >= 0; i--){
             int[] curr = new int[n];

        for(int j = n-1; j >=0; j--){

            if(obstacleGrid[i][j] == 1){
                curr[j] =0;
            }

            else if(i == m-1 && j == n-1){
                curr[j] = 1;

            }
            else{
                int right =0;
                int down =0;

                if(j+1<n)
                right = curr[j+1];

                if(i+1<m)
                down = prev[j];

                curr[j] = right + down;
            }
        }
        prev = curr;

         }
   return prev[0];
    }
}