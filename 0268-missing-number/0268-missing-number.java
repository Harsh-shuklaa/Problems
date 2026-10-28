class Solution {
    public int missingNumber(int[] nums) {
     
     int Xorr1 = 0;
     int Xorr2 = 0;
     for(int i =0; i<nums.length;i++){
        Xorr2 = Xorr2^nums[i];
        Xorr1=Xorr1^(i+1); 
     }
     return Xorr1^Xorr2;
}
}