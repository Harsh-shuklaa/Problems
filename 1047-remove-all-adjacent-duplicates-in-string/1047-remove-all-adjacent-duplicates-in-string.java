class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();
        String first = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(ch);
                first = String.valueOf(ch);
            }
            else if (stack.peek() == ch) {
                stack.pop();
                first = first.substring(0, first.length() - 1);
            }
            else {
                stack.push(ch);
                first = first + ch;
            }
        }

        return first;
    }
}