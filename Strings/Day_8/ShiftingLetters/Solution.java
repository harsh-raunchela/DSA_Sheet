package Day_8.ShiftingLetters;

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        long totalShift = 0; // use long to prevent overflow
        char[] result = new char[n];

        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26; // wrap around 26
            int originalCharIndex = s.charAt(i) - 'a';
            int shiftedCharIndex = (originalCharIndex + (int)totalShift) % 26;
            result[i] = (char)('a' + shiftedCharIndex);
        }

        return new String(result);
    }
}