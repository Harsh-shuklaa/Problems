class Solution {

    public int firstOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid]==target){
                first = mid;
                high=mid-1;
            }
            else  if (nums[mid]>target) {
             
            high = mid - 1;
            } else {
                low= mid + 1;
            }
        }
        return first;
    }

     public int lasttOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid]==target){
                last = mid;
                low=mid+1;
            }
            else  if (nums[mid]>target) {
             
            high = mid - 1;
            } else {
                low= mid + 1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int fo = firstOccurence(nums, target);
        int lo = lasttOccurence(nums, target);
        if (fo == -1 ){
            return new int []{-1,-1} ;
        }
        else {
            return new int[] { fo,lo };
        }

    }
}