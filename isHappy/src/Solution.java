class Solution {

    //Beats 89.66% by Runtime
    //Beats 96.48% by Memory
    public static boolean isHappy(int n) {

        double res = 0;
        res = Math.pow(n % 10, 2);

        while (n != 0){
            n /= 10;
            res += Math.pow(n % 10, 2);
        }

        if (res == 1){
           return true;
        }

        if (res < 10 && res != 7){
            System.out.println(res);
            return false;
        }

        return isHappy((int)res);
    }
}