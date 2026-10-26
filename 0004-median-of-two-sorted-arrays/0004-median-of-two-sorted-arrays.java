class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        double median = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k <= merge.length - 1; k++) {

            if (i >= nums1.length) {
                merge[k] = nums2[j++];

            } else if (j >= nums2.length) {
                merge[k] = nums1[i++];
            }
        else if(nums1[i]<=nums2[j]){
            merge[k] = nums1[i++];
        }
        else{
            merge[k] = nums2[j++];
        }
        }
        if (merge.length % 2 == 0) {
            int a = merge.length / 2;
            int b = a - 1;
            median = (merge[a] + merge[b]) / 2.0;

        } else {
            median = merge[merge.length /2]  ;
        }
        return median;
    }
}