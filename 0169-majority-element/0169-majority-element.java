class Solution {
    public int majorityElement(int[] nums) {
     int candidate =0, count = 0;

     for(int num : nums){
        if(count == 0){
            candidate = num;
            
        }
        if(num == candidate){
            count++;
        }else{
            count--;
        }

     }
     return candidate;
     
}   
}

//Majority element > n/2

//Different elements ek dusre ko cancel kar sakte hain

//Agar count 0 ho jaye
//→ naya candidate choose karo

//Same element mile
//→ count++

//Different mile
//→ count--