class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;

    
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        
        if (pivot == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

       
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, pivot, i);
                break;
            }
        }

     
        reverse(nums, pivot + 1, nums.length - 1);
    }

  
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

   
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
