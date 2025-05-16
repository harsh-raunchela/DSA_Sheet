package Day_8.CountNumberofHomogenousSubstrings;

class Solution {
    public int countHomogenous(String s) {
        final int MOD = 1_000_000_007;
        long result = 0;
        int count = 1; // start with first char

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result = (result + (long) count * (count + 1) / 2) % MOD;
                count = 1; // reset for new char
            }
        }

        // add last group
        result = (result + (long) count * (count + 1) / 2) % MOD;

        return (int) result;
    }
}