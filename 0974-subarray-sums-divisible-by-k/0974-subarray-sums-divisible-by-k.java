class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        int sum = 0;
         freq.put(0,1);
         int cnt = 0;
         int rem;

         for(int i =0;i<nums.length;i++){
            sum = sum+nums[i];
    rem = ((sum%k)+k)%k;
    if(freq.containsKey(rem)){
        cnt=cnt+ freq.get(rem);
    }
    freq.put(rem , freq.getOrDefault(rem,0)+1);
         }
         return cnt;

    }
}