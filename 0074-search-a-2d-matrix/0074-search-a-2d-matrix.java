class Solution {
    //function to search target in 2D matrix using binary search
    public boolean searchMatrix(int[][] matrix, int target) {
        //Get the number of rows
        int n = matrix.length;

        //get the number of columns
        int m = matrix[0].length;

        //set initial binary search range
        int low = 0, high = n * m -1;

        //perform binary search 
        while(low <= high) {
            //calculate middle index
            int mid = (low + high) / 2;

            //map 1D index to 2d coordinates
            int row = mid / m;
            int col = mid % m;

            //check if target is found
            if(matrix[row][col] == target)
            return true;

            //discard left half
            else if (matrix[row][col] < target)
            low = mid + 1;

            //discard right half
            else
            high = mid -1;

        }
        //target not found
        return false;
        
    }
}