class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> have = new HashMap<>();

        for(int i = 0;i<ransomNote.length();i++){
            need.put(ransomNote.charAt(i),need.getOrDefault(ransomNote.charAt(i),0)+1);
            
        }
        for(int i = 0;i<magazine.length();i++){
            have.put(magazine.charAt(i),have.getOrDefault(magazine.charAt(i),0)+1);

        }
        for (char c : need.keySet()) {
    if (have.getOrDefault(c, 0) < need.get(c)) {
        return false;
    }
}

return true;
    }
}