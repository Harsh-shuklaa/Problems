class Solution {

    public String build(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch != '#') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
}