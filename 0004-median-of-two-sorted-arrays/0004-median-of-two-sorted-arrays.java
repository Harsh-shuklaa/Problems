class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // ArrayList<Integer> merge = new ArrayList<>();
        int i = 0;
        int j = 0;
       int n1 = nums1.length;
       int n2 = nums2.length;
        int n = n1+n2;
       int cnt = 0;
        int elem1 = n/2;
        int elem2 = n/2-1; 
        int elem1el = -1;
        int elem2el = -1 ;  
        double median =0.00;
        while (i < n1  && j < n2) {
       if(nums1[i]<nums2[j]){
          if(cnt==elem1)elem1el = nums1[i];
          if(cnt==elem2)elem2el = nums1[i];
          cnt++;
          i++;
          }
       else{
          if(cnt==elem1)elem1el = nums2[j];
          if(cnt==elem2)elem2el = nums2[j];
          cnt++;
          j++;
          }
       }
        

        while(i< n1){
           if(cnt==elem1)elem1el = nums1[i];
          if(cnt==elem2)elem2el = nums1[i];
          cnt++;
          i++;
        }
        while(j< n2){
             if(cnt==elem1)elem1el = nums2[j];
          if(cnt==elem2)elem2el = nums2[j];
          cnt++;
          j++;
        }

        if(n % 2 == 1){
             return (double) elem1el;
             
        }
         return ((double) ((double)(elem1el + elem2el ) / 2.0));
            
        
    }
}