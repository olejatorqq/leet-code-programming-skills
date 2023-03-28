class Solution {
    public static int diagonalSum(int[][] mat) {
        int sum = mat.length % 2 == 0 ? 0 : -(mat[mat.length / 2][mat.length / 2]);

        int maxIdx = mat.length - 1;

        for (int i = maxIdx; i >= 0; i--){
            sum += mat[i][i];
        }

        for (int i = maxIdx; i >= 0; i--){
            sum += mat[i][maxIdx - i];
        }

        return sum;
    }
}