package Day_3.ReverseWordsinaStringIII;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }
}
