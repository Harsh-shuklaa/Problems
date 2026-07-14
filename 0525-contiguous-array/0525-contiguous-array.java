class Solution {
    public int findMaxLength(int[] nums) {
      int zeroes = 0;
      int ones = 0;
      int res= 0;
      Map <Integer,Integer>freq = new HashMap<>();


      for(int i =0;i<nums.length;i++){
        if(nums[i]==0){
            zeroes++;
        }
        else{
            ones++;
        }
           int diff  = zeroes-ones; 
           if(diff==0){
            res = Math.max(res,i+1);
           }
         else {
            if(freq.containsKey(diff)){
               res= Math.max(res,i-freq.get(diff));
            }
            else{
              freq.put(diff,i);
            }
           }
      }
      return res;
    }
}