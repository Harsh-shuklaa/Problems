
   
class Solution {


 public int squareSum(int n ){
        int sum = 0;
        while( n>0){
            int d = n%10;
             sum+=d*d;
            n/=10;
           
        }
        return sum;

    }

    public boolean isHappy(int n) {
         int slow=n, fast=n;
         while(fast!=1){
            slow= squareSum(slow);
            fast= squareSum(fast);
            fast= squareSum(fast);
            if(slow==fast && slow!=1){
                return false;
            }
            
         }
         
         return true;

    }
}