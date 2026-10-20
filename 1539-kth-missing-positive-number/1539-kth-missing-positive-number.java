class Solution {


    public int findKthPositive(int[] arr, int k) {
       int ans = k;
     for(int i =0;i<=arr.length-1;i++){
         if(arr[i]<=ans){
            ans++;

         }
        
     }
     return ans;




        // int low = 1;
        // int high = Arrays.stream(arr).max().getAsInt();

        // while(low<=high){
        //  int mid = low+(high-low)/2;

        // }

    }
}