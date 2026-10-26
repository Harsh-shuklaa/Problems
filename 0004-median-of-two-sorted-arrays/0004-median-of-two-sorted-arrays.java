class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merge = new ArrayList<>();
        int i = 0;
        int j = 0;
        int m = nums1.length;
        int n = nums2.length;
        double median = 0.00;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merge.add(nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                merge.add(nums2[j]);
                j++;
            }
        }

        while(i< m){
            merge.add(nums1[i]);
            i++;
        }
        while(j< n){
            merge.add(nums2[j]);
            j++;
        }

        if(merge.size()%2 ==0){
              median = (double) (merge.get(merge.size()/2) + merge.get(merge.size()/2 -1)) /2;
        }
        else{
             median= (double) merge.get(merge.size()/2);
        }
        return median ;
    }
}