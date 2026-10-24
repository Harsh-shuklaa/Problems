class Solution {
    public int findPeakElement(int[] nums) {
        int low = 1;
        int high = nums.length-2;

        while(low<=high){
            int mid = low+(high-low)/2;
            boolean peak = nums[mid] > nums[mid - 1] &&
               nums[mid] > nums[mid + 1];
            if(peak){
               return mid;
            }
            if(nums[mid]>nums[mid-1]){
                low = mid+1;

            }
            else{
                high = mid-1;
            }
        }
        if( nums.length > 1 && nums[0]>nums[1]  ){
            return 0;
        }
        if(   nums.length>1 && nums[nums.length-1]>nums[nums.length-2]  ){
            return nums.length-1;
        }
        if(nums.length==1){
            return 0;
        }
        return 0;
    }
}