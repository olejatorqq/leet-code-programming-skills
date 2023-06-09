public class Solution {
    // you need to treat n as an unsigned value

    // My first solution
     public static int hammingWeight(int n) {
         return Integer.bitCount(n);
     }

    // My second solution
     public static int hammingWeight(int n) {
         int count = 0;
         while(n > 0){
             count += (n & 1);
             n = n >>> 1;
         }
         return count;
     }
}
