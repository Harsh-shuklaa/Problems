class Solution {

    public int findKthPositive(int[] arr, int k) {

        int i = 0;
        int j = 1;

        while (k > 0) {
            if(i<arr.length && arr[i]==j) {
                i++;
            }
            else{
                k--;
                if(k==0){
                    return j;
                }
            }
            j++;

        }
        return j;

        //  for(int i =0;i<=arr.length-1;i++){
        //      if(arr[i]<=k){
        //         k++;

        //      }

        //  }
        //  return k;

        // int low = 1;
        // int high = Arrays.stream(arr).max().getAsInt();

        // while(low<=high){
        //  int mid = low+(high-low)/2;

        // }

    }
}