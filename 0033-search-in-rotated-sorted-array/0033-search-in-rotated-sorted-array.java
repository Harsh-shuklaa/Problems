class Solution {

    public int findPivot(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return i;
            }

        }
        return 0;
    }

    public int binarySearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public int search(int[] nums, int target) {

        int firstSearch = binarySearch(nums, 0, findPivot(nums, target) - 1, target);
        int secondSearch = binarySearch(nums, findPivot(nums, target), nums.length - 1, target);

        if (firstSearch != -1) {
            return firstSearch;
        }
        if (secondSearch != -1) {
            return secondSearch;
        }
        return -1;

    }
}