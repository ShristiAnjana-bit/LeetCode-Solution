class Solution {
    public void rotate(int[][] matrix) {
       int n = matrix.length;

       //step 1: Transpose (Swap element acrosss the diagonal) 
       for(int i =0; i<n; i++){
        for(int j=i; j<n; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
       }
       //step 2: reverse each row 
       for(int i =0; i<n; i++){
        //standard two-pointer reverse logic for each row
        for(int j= 0; j<n/2; j++ ){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n-1-j];
            matrix [i][n-1-j] = temp;
        }
       }
    }
}