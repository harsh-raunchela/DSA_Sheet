package Lengthoflastword;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int lastLen = words[words.length - 1].length();
        return lastLen;
    }
}
