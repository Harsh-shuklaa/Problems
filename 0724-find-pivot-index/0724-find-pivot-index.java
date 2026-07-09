class Solution {
    public int pivotIndex(int[] nums) {
      int [] prefix =  new int [nums.length];
      int [] suffix = new int [nums.length];

      for(int i =1;i<prefix.length;i++ ){
        prefix[i] = prefix[i-1] + nums[i-1];
      }
      for(int j =suffix.length-2;j>=0;j-- ){
        suffix[j] = suffix[j+1] + nums[j+1];
      }

     for(int k = 0;k<nums.length;k++){
        if(prefix[k] == suffix[k]){
            return k;
        }
       
     }
 return -1;
    }

}
