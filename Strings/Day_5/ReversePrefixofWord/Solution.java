package Day_5.ReversePrefixofWord;

class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder reversed = new StringBuilder();
        for (int i = index; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }

        for(int i = index + 1; i <word.length(); i++) {
            reversed.append(word.charAt(i));
        }

        return reversed.toString();
    }
}