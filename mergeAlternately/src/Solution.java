class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        String resultString = "";
        while (i < word1.length() && j < word2.length()){
            resultString = resultString + word1.charAt(i) + word2.charAt(j);
            i++;
            j++;
        }

        while (i < word1.length()){
            resultString = resultString + word1.charAt(i);
            i++;
        }
        while (j < word2.length()){
            resultString = resultString + word2.charAt(j);
            j++;
        }

        return resultString;
    }
}