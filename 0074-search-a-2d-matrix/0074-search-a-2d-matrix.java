class Solution {
    //function to search target in 2D matrix using binary search
    public boolean searchMatrix(int[][] matrix, int target) {
       //get the number of rows
       int n = matrix.length;

       //get the number of col
       int m = matrix[0].length;

       //set initial binary seARCH range
       int low = 0;
       int high = n * m -1;

       //perform binary search
     while(low <= high){
        //calculate middle index
        int mid = (low + high) / 2;

        int row = mid / m;
        int col = mid % m;

        // check if target is found
        if(matrix[row][col] == target)
        return true;

      //discard left half
      else if(matrix[row][col]<target)
      low = mid + 1;

        //discard right half
        else
        high = mid -1;
     }
     //target not found
     return false;
    }
}