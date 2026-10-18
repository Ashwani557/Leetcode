class Solution {
    public String reverseStr(String s, int k) {
        String res = "";

        for (int i = 0; i < s.length(); i += 2 * k) {
            int end = Math.min(i + k, s.length());

            res += new StringBuilder(s.substring(i, end)).reverse();

            if (i + k < s.length()) {
                res += s.substring(i + k, Math.min(i + 2 * k, s.length()));
            }
        }

        return res;
    }
}