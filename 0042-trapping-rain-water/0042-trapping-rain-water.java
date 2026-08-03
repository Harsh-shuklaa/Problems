class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int [height.length];
        int[] maxRight = new int [height.length];
      
        int[] water = new int [height.length];
        int ans = 0;
         maxLeft[0] = height[0];
         maxRight[height.length-1] = height[height.length-1];

        for(int i = 1;i<maxLeft.length;i++){
           maxLeft[i]=Math.max(maxLeft[i-1],height[i]);
        }
        for(int i =maxRight.length-2 ;i>=0;i--){
           maxRight[i]=Math.max(maxRight[i+1],height[i]);
        }
        for(int i = 0;i<water.length;i++){
           water[i]=Math.min(maxRight[i],maxLeft[i])-height[i];
        }
        for(int i = 0;i<water.length;i++){
           ans=ans+water[i];
        }
        return ans;
       


    }
}