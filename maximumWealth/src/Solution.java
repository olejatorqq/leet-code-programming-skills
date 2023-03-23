import java.util.*;

class Solution {
    public static int maximumWealth(int[][] accounts) {
        int maxSum = 0;

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                maxSum += accounts[i][j];
            }
            result.add(maxSum);
            maxSum = 0;
        }

        return Collections.max(result);
    }
}
