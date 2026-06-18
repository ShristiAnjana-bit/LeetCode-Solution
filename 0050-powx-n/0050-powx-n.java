//class containing power calculation logic 
class Solution {
    //helper method to calculate power using recursion
    public double myPow(double x, int n) {
        long N = n;

        if(N <0){
            x = 1/x;
            N = -N;
        }

       double ans = 1;

       while(N > 0){
        //IF THE EXPONENT IS ODD
        if(N%2 == 1){
            ans *= x;
        }
        //SQUARE THE BASE
      x *= x;
      //HALVE THE EXPONENT
      N /=2;
        
       }

       return ans;

    
     
    }
}