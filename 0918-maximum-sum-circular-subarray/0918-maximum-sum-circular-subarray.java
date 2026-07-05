class Solution {
    public int maxSubarraySumCircular(int[] nums) {
         int max_best_ending = nums[0];
         int min_best_ending = nums[0];
         int sum = nums[0];
         int min_so_far=nums[0];

         int max_so_far  = nums[0];
         
         for(int i = 1 ; i<nums.length;i++){
             sum +=nums[i];
              max_best_ending=Math.max(max_best_ending+nums[i],nums[i]);
              min_best_ending=Math.min(min_best_ending+nums[i],nums[i]);
             min_so_far = Math.min(min_so_far,min_best_ending);

              max_so_far = Math.max(max_so_far , max_best_ending);

         }
         
           if(max_so_far<0){
            return max_so_far;
           }

         return Math.max(max_so_far,sum-min_so_far);
    }
}