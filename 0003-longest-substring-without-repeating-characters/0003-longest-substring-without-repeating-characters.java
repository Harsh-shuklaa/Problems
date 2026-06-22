class Solution {
    public int lengthOfLongestSubstring(String s) {
        int high = 0;
        int low = 0;
        int res = Integer.MIN_VALUE;
        Map<Character,Integer>freq = new HashMap<>();
        int n = s.length();

        for(high= 0; high<n;high++){
         //high ko information me include kro
       

         freq.put(s.charAt(high),freq.getOrDefault(s.charAt(high),0)+1);
         int k = high-low +1;
         while( freq.size() < k){
             freq.put(s.charAt(low),freq.get(s.charAt(low))-1);
             if(freq.get(s.charAt(low))==0){
                freq.remove(s.charAt(low));
             } 
             low++;
             k= high - low +1;
         }


         if( freq.size() == k){
            res = Math.max(k ,res);
         }
         

        }
         return ( res == Integer.MIN_VALUE) ? 0 : res;
     }
}