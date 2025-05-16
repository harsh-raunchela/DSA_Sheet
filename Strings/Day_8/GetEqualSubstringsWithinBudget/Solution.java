package Day_8.GetEqualSubstringsWithinBudget;

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0, maxLength = 0, currentCost = 0;

        for (int right = 0; right < s.length(); right++) {
            int cost = Math.abs(s.charAt(right) - t.charAt(right));
            currentCost += cost;

            while (currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}