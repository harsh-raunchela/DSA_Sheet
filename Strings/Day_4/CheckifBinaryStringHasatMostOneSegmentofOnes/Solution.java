package Day_4.CheckifBinaryStringHasatMostOneSegmentofOnes;

class Solution {
    public boolean checkOnesSegment(String s) {
        int[] intArray = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            intArray[i] = s.charAt(i) - '0';  // Convert char to int
        }

        for(int i =0; i < s.length() - 1; i++){
            if(intArray[i] == 0 && intArray[i + 1] == 1){
                return false;

            }
        }
        return true;
    }
}
