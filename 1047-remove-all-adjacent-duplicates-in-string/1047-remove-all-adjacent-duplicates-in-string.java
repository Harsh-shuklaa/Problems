class Solution {
    public String removeDuplicates(String s) {

        String first = "";

        for (int i = 0; i < s.length(); i++) {

            String ch = String.valueOf(s.charAt(i));

            if (first.length() == 0) {
                first = ch;
            }
            else if (first.charAt(first.length() - 1) == ch.charAt(0)) {
                first = first.substring(0, first.length() - 1);
            }
            else {
                first = first + ch;
            }
        }

        return first;
    }
}