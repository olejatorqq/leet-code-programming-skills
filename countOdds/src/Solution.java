class Solution {
    // My solution
    public static int countOdds(int low, int high) {
        int counter = 0;
        for(; low <= high; low++) {
            if (low % 2 == 1) counter++;
        }
        return counter;
    }
}
