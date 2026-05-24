class Solution {
    public void setZeroes(int[][] matrix) {
     int n = matrix.length;
     int m = matrix[0].length;
     int col0 =1; //extra variable for the first col

     //step 1: traverse the matrix and mark 1st row and 1st col
     for(int i =0; i<n; i++){
        for(int j=0; j<m; j++){
            if(matrix[i][j] == 0){
                //mark ith row
                matrix[i][0] =0;
            //mark jth col
            if(j!=0)
            matrix[0][j] =0;
            else 
            col0=0;

            }
        }
     }
     //step 2: update the inner matrix(1,1) to (n,m)
     for(int i =1; i<n; i++){
        for(int j=1; j<m; j++){
            if(matrix[i][j] != 0){
                //check if rwo and col are marked
                if(matrix[i][0] == 0 || matrix[0][j]==0){
                    matrix[i][j] =0;
                }
            }
        }

     }
     //step 3: update the first row(depend on matrix)
     if(matrix[0][0] ==0){
        for(int j=0; j<m; j++){
            matrix[0][j] =0;

        }
     }
     //step 4: update the first column(depend on col0)
      if(col0 ==0){
      for(int i=0; i<n; i++){
        matrix[i][0] =0;
      }

      }


        }
        }
     
        
        
    