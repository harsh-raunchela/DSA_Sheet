package Day_4.CheckiftehSentenceisPangram;

class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)return false;

        boolean[] sent = new boolean[26];
        int count = 0;

        for(char c : sentence.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                int index = c - 'a';

                if(!sent[index]){
                    sent[index] = true;
                    count ++;
                }
            }
            if(count == 26)return true;
        }
        return false;
    }
}
