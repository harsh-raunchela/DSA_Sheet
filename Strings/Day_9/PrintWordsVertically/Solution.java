package Day_9.PrintWordsVertically;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int maxLen = 0;

        for(String word : words){
            maxLen = Math.max(maxLen, word.length());
        }

        List<String> result = new ArrayList<>();

        for(int i =0; i < maxLen; i++){
            StringBuilder sb = new StringBuilder();
            for(String word : words){
                if(i < word.length()){
                    sb.append(word.charAt(i));
                }else{
                    sb.append(' ');
                }
            }

            int j = sb.length() -  1;
            while(j >= 0 && sb.charAt(j) == ' '){
                j--;
            }

            result.add(sb.substring(0, j + 1));
        }
        return result;
    }
}