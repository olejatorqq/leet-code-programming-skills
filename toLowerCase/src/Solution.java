class Solution {
    public static String toLowerCase(String s) {
        char[] arrayS = s.toCharArray();
        for (int i = 0; i < arrayS.length; i++){
            if (arrayS[i] >= 65 && arrayS[i] <= 90){
                arrayS[i] += 32;
            }
        }

        return String.valueOf(arrayS);
    }
}