class Solution {
    public int maxNumberOfBalloons(String text) {
         HashMap<Character,Integer> have = new HashMap<>();
         for(int i = 0;i<text.length();i++){
            have.put(text.charAt(i),have.getOrDefault(text.charAt(i),0)+1);
         }
         HashMap<Character,Integer> need = new HashMap<>();
         need.put('b',1);
         need.put('a',1);
         need.put('l',2);
         need.put('o',2);
         need.put('n',1);
    
    int ans  = Integer.MAX_VALUE;

    for(char c : need.keySet() ){
    int available = have.getOrDefault(c,0);
    int required = need.get(c);

    ans= Math.min(ans,available/required);

    }
    return ans;
}
}