package Day_4.LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)return "";

        //assume the first string as the common prefix
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            //check if prefix is at the start
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);//shorten the prefix
                if(prefix.isEmpty())return"";
            }
        }
        return prefix;
    }
}
