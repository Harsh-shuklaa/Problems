class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> freq = new HashMap<>();
        for(int i = 0; i<s.length();i++){
           freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0;i<s.length();i++){
             if(freq.get(s.charAt(i))==1){
                return i;
             }
        }
        return -1;

    }
}