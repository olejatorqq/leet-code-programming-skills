import java.util.Arrays;

class Solution {
    public static String freqAlphabets(String s) {
        StringBuilder h = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#'){
                char c = (char) (Integer.parseInt(String.valueOf(s.charAt(i)) + s.charAt(i + 1)) + 96);
                h.append(c);
                i += 2;
            }
            else {
                char c = (char) (Integer.parseInt(String.valueOf(s.charAt(i))) + 96);
                h.append(c);
            }
        }
        return h.toString();
    }
}