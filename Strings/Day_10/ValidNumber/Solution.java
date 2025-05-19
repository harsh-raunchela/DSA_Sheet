package Day_10.ValidNumber;

class Solution {
    public boolean isNumber(String s) {
        s = s.trim(); // remove any leading/trailing spaces

        boolean hasDigit = false;
        boolean hasDot = false;
        boolean hasE = false;
        boolean digitAfterE = true; // start true, will flip if 'e' appears

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigit = true;
                if (hasE) digitAfterE = true;
            } else if (ch == '+' || ch == '-') {
                // sign must be at the beginning or right after 'e'
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (ch == '.') {
                // dot can’t appear after 'e' or more than once
                if (hasDot || hasE) {
                    return false;
                }
                hasDot = true;
            } else if (ch == 'e' || ch == 'E') {
                // must appear only once, must have a digit before it
                if (hasE || !hasDigit) {
                    return false;
                }
                hasE = true;
                digitAfterE = false; // must check digits after 'e'
            } else {
                // any other character is invalid
                return false;
            }
        }

        return hasDigit && digitAfterE;
    }
}