class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int count_subarray = 0;
         int product = 1;
        for( high =0;high<nums.length;high++){
            

            product = product*nums[high];

            while(product>=k){
                product= product/nums[low];
                low++;

            }
            count_subarray=count_subarray+(high-low+1);
        }
        return count_subarray;

    }
}