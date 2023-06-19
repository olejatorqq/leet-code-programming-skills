public class Solution {
    public static String gcdOfStrings(String str1, String str2){
        if (str1.equals(str2)){
            return str1;
        }

        if (str1.length() > str2.length()){
            return replaceResult(str1, str2);
        } else{
            return replaceResult(str2, str1);
        }
    }

    public static String replaceResult(String str1, String str2){
        while (str1.contains(str2)){
            str1 = str1.replace(str2, "");
        }
        return str1.length() == 0 ? str2 : "";
    }
}
