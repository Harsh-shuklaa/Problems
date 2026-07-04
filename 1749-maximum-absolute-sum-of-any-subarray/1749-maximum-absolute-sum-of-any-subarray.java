class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int max_ending = nums[0];
        int min_ending  = nums[0];
        int result = nums[0];

        for(int i = 1;i<nums.length;i++){
            max_ending = Math.max(max_ending+nums[i],nums[i]);
            min_ending = Math.min(min_ending+nums[i],nums[i]);
            
            result = Math.max(result, Math.max(Math.abs(max_ending),Math.abs(min_ending)));

        } 
        return (result==nums[0])? Math.abs(nums[0]):result;
        
    }
}