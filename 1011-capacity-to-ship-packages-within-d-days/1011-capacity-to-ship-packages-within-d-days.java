class Solution {

    public boolean possible(int[] weights, int days,int capacity){
        int day = 1;
        int load = 0;
        for(int i =0;i<weights.length;i++){
            if((load+weights[i])>capacity){
                day++;
                load = weights[i];
            }else{
               load+=weights[i];
            }
        }
        if(day<=days){
            return true;
        }
        else{
           return  false;
        }
    }
    public int shipWithinDays(int[] weights, int days) {
         

         int maxWeight = Arrays.stream(weights).max().getAsInt();
         int totalWeight = Arrays.stream(weights).sum();
        //  for(int i = maxWeight;i<=totalWeight;i++){
        //     if(possible(weights,days,i)){
        //         return i;
        //     }
        //  }

        while(maxWeight<=totalWeight){
            int mid = maxWeight+(totalWeight-maxWeight)/2;

            if(possible(weights,days,mid)){
                totalWeight = mid-1;
            }
            else{
                maxWeight=mid+1;
            }
        }

        
         return maxWeight;
    }
}