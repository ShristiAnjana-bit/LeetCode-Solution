class Solution {
    public void setZeroes(int[][] matrix) {
     int n =matrix.length;
     int m = matrix[0].length;

     //step 1: Auxiliary arrays(the swithcs)
     int[] row = new int[n];
     int[] col = new int[m];

     //marking ohase
     for(int i =0; i<n; i++){
        for(int j=0; j<m; j++){
            if(matrix[i][j]==0){
                row[i] =1;
                col[j] =1;
            }
        }
     }
     //step 3: zeroing phase
     for(int i =0; i<n; i++){
        for(int j=0; j<m; j++){
            //if row i OR colume j was marked
            if(row[i] == 1|| col[j] ==1){
                matrix[i][j] =0;
            }
        }
     }
        }
        }
     
        
        
    