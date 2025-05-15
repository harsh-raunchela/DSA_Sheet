package Day_7.MaximumNumberofRemovableCharacters;

class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0, right = removable.length;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canRemove(s, p, removable, mid)) {
                result = mid;      // mid removals work, try more
                left = mid + 1;
            } else {
                right = mid - 1;   // mid removals break subsequence, try less
            }
        }

        return result;
    }

    // Check if p is still subsequence after removing first k indices from s
    private boolean canRemove(String s, String p, int[] removable, int k) {
        boolean[] removed = new boolean[s.length()];
        for (int i = 0; i < k; i++) {
            removed[removable[i]] = true;
        }

        int pIndex = 0;
        for (int i = 0; i < s.length() && pIndex < p.length(); i++) {
            if (!removed[i] && s.charAt(i) == p.charAt(pIndex)) {
                pIndex++;
            }
        }

        return pIndex == p.length();
    }
}
