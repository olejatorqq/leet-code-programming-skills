
class Solution {
    public static void moveZeroes(int[] nums) {
        if (nums.length > 1) {

            int i = 0;

            for(int x : nums){
                if (x != 0){
                    nums[i++] = x;
                }
            }
            for(; i < nums.length; ++i){
                nums[i] = 0;
            }
        }
    }
}