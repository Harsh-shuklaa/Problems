class Solution {

    public int stdCnt(int[] nums, int pages, int k ) {
        int student = 1;
        int pageCnt = 0;

        for (int num : nums) {
            if (pageCnt + num <= pages) {
                pageCnt += num;
            } else {
                student++;

                if(student>k){
                    return student;
                }
                pageCnt = num;
            }
        }

        return student;
    }

    public int splitArray(int[] nums, int k) {
        // int high = Arrays.stream(nums).max().getAsInt();
        // int sum = Arrays.stream(nums).sum();
        int low= 0;
        int sum = 0;
        

        for (int num : nums) {
            low = Math.max(low, num);
            sum += num;
        
        }
        int high = sum;

        // for (int pages = low; pages <= sum; pages++) {
        //     if (stdCnt(nums, pages , k) <= k) {
        //         return pages;
        //     }

        // }

        while(low<=high){
            int mid = low+(high-low)/2;
            if(stdCnt(nums,mid, k)<=k){
               high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return low;

    }
}
