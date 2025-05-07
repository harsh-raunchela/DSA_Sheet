package Day_1.NumberofWaystoSplitaString;

class Solution {
    public int numWays(String s) {
        final int MOD = 1_000_000_007;
        int n = s.length();
        int totalOnes = 0;

        // Count total number of 1s
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }

        // Case 1: All zeros
        if (totalOnes == 0) {
            long ways = ((long)(n - 1) * (n - 2) / 2) % MOD;
            return (int) ways;
        }

        // Case 2: Not divisible by 3
        if (totalOnes % 3 != 0) return 0;

        // Case 3: Divisible by 3
        int onesPerPart = totalOnes / 3;
        long firstCutWays = 0, secondCutWays = 0;
        int onesCount = 0;

        for (int i = 0; i < n - 1; i++) { // we can't cut after the last char
            if (s.charAt(i) == '1') onesCount++;

            if (onesCount == onesPerPart) firstCutWays++;
            else if (onesCount == 2 * onesPerPart) secondCutWays++;
        }

        return (int)((firstCutWays * secondCutWays) % MOD);

    }
}
