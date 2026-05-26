class Solution {
    public  List<Integer> generateRow(int row) {
        long ans =1; //use long to prevent overflow
            List<Integer> ansRow = new ArrayList<>();
            ansRow.add(1);  //the first element is always 1

            for(int col = 1; col<row; col++){
                //logic : ans * (row.index -col_index)/ col_index
                ans = ans * (row - col);
                ans = ans/col;
                ansRow.add((int) ans);
            }
            return ansRow;
        
    }
    //main funtion to gentrate the entire triangle up to row N
    public  List<List<Integer>> generate(int numRows){
        List<List<Integer>>result = new ArrayList<>();

        for(int i =1; i<=numRows; i++){
            //gentrate row and col add it to final list
            result.add(generateRow(i));
        }
        return result;

    }
    
    }
