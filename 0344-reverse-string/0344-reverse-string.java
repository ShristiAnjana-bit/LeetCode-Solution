class Solution {
    public void reverseString(char[] s) {
        // we call a healper function and pass the starting boundaries
        solve(s, 0, s.length-1);
    }
    //helper funcation to track the left and right pointers
    private void solve(char[] s,int left,int right){
        //base case:if pointers cross or meet , stop recursion
        if(left>=right){
            return;

        }
        //process: swap characters at left and right
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        //Recursive call: move pointers closer and call again
        solve(s,left+1 , right-1);

    }
        
        

        
    
}