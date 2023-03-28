class Solution {
    public static String interpret(String command) {
        return command.replace("(G)", "G").replace("(al)", "al").replace("()", "o");
    }
}