package Day_8.MinimumLengthofStringAfterDeletingSimilarEnds;

class Solution {
    public int minimumLength(String s) {
        int left  = 0, right = s.length() - 1;

        while(left < right && s.charAt(left) == s.charAt(right)){
            char ch = s.charAt(left);
            //move left pointer forward past all the matching chars
            while(left <= right && s.charAt(left) == ch)left++;
            //move right pointer backward past all matching chars
            while(right >= left && s.charAt(right) == ch) right--;
        }
        return right - left + 1;
    }
}