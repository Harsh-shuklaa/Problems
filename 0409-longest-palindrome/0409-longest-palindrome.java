class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int  oddCnt = 0;
        int res = 0;
        for(char ch : s.toCharArray()){
            // freq.put(ch,freq.getOrDefault(ch,0)+1);
            
            if(set.contains(ch)){
                res+=2;
                set.remove(ch);
            }
            else{
               set.add(ch);
            }
            // int currFreq = freq.get(ch);
            // if(currFreq%2==0){
            //     res+=2;
            //     oddCnt--;
            // }
            // else{
            //     oddCnt++;
            // }
        }
        // for(char i : freq.keySet()){
        //     if(freq.get(i)%2 == 0){
        //         res = res+freq.get(i);
        //     }

        //     if (freq.get(i)%2 == 1){
        //       oddCnt = true;
        //       if(freq.get(i)>1){
        //        res = res+freq.get(i)-1;
        //       }
              
        //     }
        // }
        // if(oddCnt>0){
        //     return res+1;
        // }
        // else{
        //     return res;
        // }

        if(set.size()>0){
             return res=res+1;
        }
        else{
            return  res;
        }
    }
}