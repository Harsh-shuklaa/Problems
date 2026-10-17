class Solution {

    public int maxPileInPiles(int[] piles){
         int max = Integer.MIN_VALUE;
        for(int i= 0;i<piles.length;i++){
           max = Math.max(max,piles[i]);
        }
        return max;

    }
    public int timeReq(int[] piles, int hourly){
        int totalHrs = 0;
        for(int i=0;i<piles.length;i++){
            totalHrs+=Math.ceil((double)piles[i]/ hourly );

        }
        return totalHrs;

    }
    public int minEatingSpeed(int[] piles, int h) {
         int low = 1;
         int high = maxPileInPiles(piles);

         while(low<=high){
            int mid = low+(high-low)/2;
            if(timeReq(piles,mid)<=h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
         }
       
            
        
        return low;
    }
}