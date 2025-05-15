package Day_7.NextGreaterElementIII;

class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int i = digits.length - 2;

        // Step 1: Find the first decreasing digit
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) return -1; // Already the highest permutation

        // Step 2: Find digit just larger than digits[i]
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: Reverse the rest
        reverse(digits, i + 1, digits.length - 1);

        long val = Long.parseLong(new String(digits)); // Use long to catch overflow
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
