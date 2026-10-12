class Solution {
    public int singleNonDuplicate(int[] nums) {
        for(int i = 0; i<nums.length;i++){
            if(i==0){
              if( nums.length >1 && nums[i]!=nums[i+1]){
                return nums[i];
              }
            }
            else if (i==nums.length-1){
                 if(nums[i]!=nums[i-1]){
                      return nums[i];
                 }
            }
            else{
                if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                     return nums[i];
                }
            }
        }
        return nums[0];
    }
}