class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows*cols-1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            //convert 1d INDEX TO 2D ROW, COL

            int row = mid/cols;
            int col = mid% cols;

            int midValue = matrix[row][col];

            if (midValue == target) {
                return true; // found
            } else if (midValue < target){
                left = mid+1; /// search right half
            } else {
                right = mid-1; // search left half
            }
        }
        return false; //not found
    }
}