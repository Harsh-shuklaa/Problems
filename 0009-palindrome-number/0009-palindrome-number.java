class Solution {
    public boolean isPalindrome(int x) {
        int revNum = 0 ;
        int dup = x;
     while(x>0){
        int lastDigit = x%10;
        //    if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10) {
        //         return 0;
        //     }
        revNum = (revNum*10)+lastDigit;
  x=x/10;
     }
     if(dup == revNum){
        return true;
     }
     return false ;

        
    }
}