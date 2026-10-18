class Solution {

    
    public boolean possible(int[] bloomDay, int day, int m, int k) {
      
        int cnt = 0;
        int bouquet = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                cnt++;
            } else {
                bouquet += cnt / k;
                cnt = 0;
            }

        }
        bouquet += cnt / k;
        if (bouquet >= m) {
            return true;
        } else {
            return false;
        }
    }

    public int minBloomDay(int[] bloomDay) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i <= bloomDay.length-1; i++) {
            mini = Math.min(mini, bloomDay[i]);
        }
        return mini;
    }

    public int maxBloomDay(int[] bloomDay) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i <= bloomDay.length-1; i++) {
            maxi = Math.max(maxi, bloomDay[i]);
        }
        return maxi;
    }

    public int minDays(int[] bloomDay, int m, int k) {

            if((long)m*k > bloomDay.length){
                    return -1;
                }
        // for (int i = minBloomDay(bloomDay); i <= maxBloomDay(bloomDay); i++) {
        //     if (possible(bloomDay, i, m, k)) {
        //         return i;
        //     }
               
        // }

         int low = minBloomDay(bloomDay);
         int high = maxBloomDay(bloomDay);
       
         while(low<=high){
            int mid = low+(high-low)/2;

            if(possible(bloomDay,mid,m,k)){
                high=mid-1;
            }
            else{
                low = mid+1;
            }

         }
        return low;
    }
}