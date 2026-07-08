class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (total - sum - nums[i] == sum) {
                return i;
            } else {
                sum += nums[i];
            }

        }
        return -1;

    }

}
