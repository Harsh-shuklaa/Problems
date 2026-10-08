class Solution {

    public int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
       

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
             
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int upperBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length ;
        

        while (low <high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                
                low= mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }

    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        int ub = upperBound(nums, target);
        if (lb == nums.length || nums[lb] != target) {
            return new int[] { -1, -1 };
        }

        else {
            return new int[] { lb, ub - 1 };
        }

    }
}