import java.util.Arrays;

class Solution {
    public static int arraySign(int[] nums) {
        int lessZeroCounter = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                return 0;
            }
            if (nums[i] < 0){
                lessZeroCounter++;
            }
        }
        return lessZeroCounter % 2 == 0 ? 1 : -1;
    }
}
