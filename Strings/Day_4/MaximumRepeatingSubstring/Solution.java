package Day_4.MaximumRepeatingSubstring;

class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String str = word;
        while(sequence.contains(str)){
            count++;
            str += word;
        }
        return count;
    }
}
