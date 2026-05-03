class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>result = new ArrayList<>();
        if(matrix == null ||  matrix.length ==0) return result;

        int n = matrix.length; // total row
        int m = matrix[0].length; //total columns

        int top=0  , bottom = n-1;
        int left =0, right =m-1;

        while(top<=bottom && left<=right){
            //1.move rigth:Across the top row
            for(int j= left; j<=right; j++){
                result.add(matrix[top][j]);
            }
            top++; //top row finished

            //2. Move down along the right col
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);

            }
            right--; //right col finished

            //3. move left across the bottom row
            if(top<=bottom){ //check if a row still exists
            for(int j=right; j>=left; j--){
                result.add(matrix[bottom][j]);
            }
            bottom--; //bottom row finished

            }

         //4. move up along the left col
        if(left<=right){ //check if a col still exist
        for(int i = bottom; i>=top; i--){
            result.add(matrix[i][left]);
        }
        left++; //left col finished

        }
    }
    return result;
    }
}