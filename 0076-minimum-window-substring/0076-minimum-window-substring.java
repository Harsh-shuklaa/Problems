
class Solution {

    boolean check(int[] sArray, int[] tArray) {
        for (int i = 0; i < 256; i++) {
            if (sArray[i] < tArray[i]) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        int high = 0;
        int low = 0;
        int minLen = Integer.MAX_VALUE;
        int[] sArray = new int[256];
        int[] tArray = new int[256];
        int start = low;

        for (int i = 0; i < t.length(); i++) {

            tArray[t.charAt(i)]++;

        }

        for (high = 0; high < s.length(); high++) {
            sArray[s.charAt(high)]++;
            while (check(sArray, tArray)) {
                int len = high - low + 1;
                if (len < minLen) {
                    minLen = len;
                    start = low;
                }
                sArray[s.charAt(low)]--;
                low++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minLen);
    }
}