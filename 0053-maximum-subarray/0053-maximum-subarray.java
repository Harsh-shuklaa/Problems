class Solution {
    public int maxSubArray(int[] nums) {
        int maxiSum = Integer.MIN_VALUE;
         int sum = 0;
         for(int i = 0;i<nums.length;i++){
            sum +=nums[i];
            maxiSum= Math.max(sum,maxiSum);
            if(sum<0){
                sum=0;
            }
         }
        return maxiSum;
    }
}