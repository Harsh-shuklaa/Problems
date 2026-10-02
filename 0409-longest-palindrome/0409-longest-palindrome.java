class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        boolean oddCnt = false;
        int res = 0;
        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(char i : freq.keySet()){
            if(freq.get(i)%2 == 0){
                res = res+freq.get(i);
            }

            if (freq.get(i)%2 == 1){
              oddCnt = true;
              if(freq.get(i)>1){
               res = res+freq.get(i)-1;
              }
              
            }
        }
        if(oddCnt){
            return res+1;
        }
        else{
            return res;
        }
    }
}