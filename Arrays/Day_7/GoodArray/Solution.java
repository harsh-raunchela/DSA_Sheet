package Day_7.GoodArray;

class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd = nums[0];

        for (int i = 1; i < nums.length; i++) {
            gcd = gcd(gcd, nums[i]);
            if (gcd == 1) return true; // Early exit — 1 is the lowest possible GCD
        }

        return gcd == 1;
    }

    // Euclidean Algorithm to calculate GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
