class Solution {
    public static int subtractProductAndSum(int n) {
        int power = 1;
        int sum = 0;
        while (n > 0){
            power *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return power - sum;
    }
}
