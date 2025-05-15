package Day_7.SwapAdjacentinLRString;

class Solution {
    public boolean canTransform(String start, String end) {
// Rule 1: Sequence of L and R must be the same
        if (!start.replace("X", "").equals(end.replace("X", ""))) {
            return false;
        }

        int i = 0, j = 0;
        int n = start.length();

        while (i < n && j < n) {
            // Skip all X in start
            while (i < n && start.charAt(i) == 'X') i++;
            // Skip all X in end
            while (j < n && end.charAt(j) == 'X') j++;

            // If both reached end, done
            if (i == n && j == n) return true;

            // If one reaches end but the other doesn't → invalid
            if (i == n || j == n) return false;

            // Check if the characters match
            if (start.charAt(i) != end.charAt(j)) return false;

            // Check movement rules
            if (start.charAt(i) == 'L' && i < j) return false; // L can't move right
            if (start.charAt(i) == 'R' && i > j) return false; // R can't move left

            i++;
            j++;
        }

        return true;
    }
}
