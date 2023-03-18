import java.util.Arrays;


class Solution {
    // My Solution
    public static double average(int[] salary) {
        Arrays.sort(salary);
        salary = Arrays.copyOfRange(salary, 1, salary.length - 1);
        return (double) Arrays.stream(salary).sum() / salary.length;
    }
}
