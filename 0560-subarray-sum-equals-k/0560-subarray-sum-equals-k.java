class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        int sum = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // running sum;
            if (freq.containsKey(sum-k))  // find 
             {
                cnt+=freq.get(sum-k);
            }

           freq.put(sum, freq.getOrDefault(sum, 0) + 1); // add running sum into prefix sum 

        }
        return cnt;
    }
}