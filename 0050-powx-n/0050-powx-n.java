//class containing power calculation logic 
class Solution {
    //helper method to calculate power using recursion
    public double myPow(double x, int n) {
       
     long N = n; //prevent overflow

     if(N <0){
        x = 1/x;
        N = -N;
     } 
     double ans = 1;

     while (N >0){
        if(N %2 == 1){
            ans *= x;

        }
        //square the base
        x *= x;
     
     //halve the exponent
     N /= 2;

     }
  return ans;
    }
}