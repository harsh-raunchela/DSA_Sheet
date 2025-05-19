package Day_10.RegularExpressionMatching;

class Solution {
    public boolean isMatch(String s, String p) {
        // Base case: if pattern is empty
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        // Check if first characters match (if s is not empty)
        boolean firstMatch = (!s.isEmpty() &&
                (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

        // If pattern has '*' as the second char
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || // use '*' as 0 times
                    (firstMatch && isMatch(s.substring(1), p)); // use '*' as 1+ times
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}