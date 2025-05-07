package Day_1.ValidNumber;

class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        if (s.isEmpty()) return false;

        int eIndex = Math.max(s.indexOf('e'), s.indexOf('E'));
        if (eIndex != -1) {
            String base = s.substring(0, eIndex);
            String exp = s.substring(eIndex + 1);
            return (isDecimal(base) || isInteger(base)) && isInteger(exp);
        }

        return isDecimal(s) || isInteger(s);
    }

    private boolean isInteger(String s) {
        if (s.isEmpty()) return false;
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
        if (i == s.length()) return false;
        for (; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }

    private boolean isDecimal(String s) {
        if (s.isEmpty()) return false;
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
        boolean dotSeen = false, digitSeen = false;

        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.') {
                if (dotSeen) return false;
                dotSeen = true;
            } else if (Character.isDigit(c)) {
                digitSeen = true;
            } else {
                return false;
            }
        }
        return digitSeen;
    }
}
