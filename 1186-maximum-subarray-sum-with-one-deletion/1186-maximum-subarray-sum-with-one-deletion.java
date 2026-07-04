class Solution {
    public int maximumSum(int[] nums) {
        int no_delete_ending = nums[0];
        int one_delete_ending = Integer.MIN_VALUE;
        int result = nums[0];

        for(int i = 1;i<nums.length;i++){
              int prev_no_delete_ending = no_delete_ending;
              int prev_one_delete_ending = one_delete_ending;

              no_delete_ending = Math.max(no_delete_ending + nums[i] , nums[i]);

              int v2 ;
              if(prev_one_delete_ending ==Integer.MIN_VALUE){
                v2 =nums[i];
              }
              else{
                v2 = prev_one_delete_ending +nums[i];
              }

              one_delete_ending = Math.max(v2,prev_no_delete_ending);
              result = Math.max(result,Math.max(one_delete_ending,no_delete_ending));
              
        }
        return result;

    }
}