class Solution {

    // public int maximumArray(int[] nums) {
    //     int maxi = Integer.MIN_VALUE;
    //     for (int i = 0; i < nums.length; i++) {
    //         maxi = Math.max(maxi, nums[i]);
    //     }
    //     return maxi;
    // }

    public int summationfn(int[] nums, int mid) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i] / mid);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 0;
        int high =Arrays.stream(nums).max().getAsInt() ;
      

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (summationfn(nums, mid) <= threshold) {
                
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return low;
    }
}