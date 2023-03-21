class Solution {
    public static boolean areAlmostEqual(String s1, String s2) {

        if(s1.equals(s2)){
            return true;
        }

        char[] chars = s1.toCharArray();

        int position = 0, count = 0;

        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(c != s2.charAt(i)){
                if(count == 0){
                    position = i;
                    count++;
                }
                else if(count == 1){
                    char temp = chars[position];
                    chars[position] = chars[i];
                    chars[i] = temp;
                    count++;
                    break;
                }
            }
        }
        if(count == 1)
            return false;
        return s2.equals(String.valueOf(chars));
    }
}