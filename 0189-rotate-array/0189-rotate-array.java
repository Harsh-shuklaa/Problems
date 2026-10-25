class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
        if (n == 0 || k == 0) return;

        k = k % n;
        if (k > n) return;

        // Step 1: Store last k elements
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - (n - k)] = nums[i];
        }

        // Step 2: Shift the rest of the array to the right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Step 3: Copy temp elements to front
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}