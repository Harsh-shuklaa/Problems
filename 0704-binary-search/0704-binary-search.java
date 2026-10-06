class Solution {
    public int search(int[] nums, int target) {
       return bs(nums,0,nums.length-1,target); 
    }
    private int bs (int[]nums, int low , int high,int target){
        //base conditon
        if(low>high){
            return -1;
        }
        int mid = low+(high-low)/2;

        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return bs(nums,low,mid-1,target);
        }
        return bs(nums,mid+1,high,target);
    }
}