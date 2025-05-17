package Day_9.CamelcaseMatching;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();

        for(String query : queries){
            result.add(matches(query, pattern));
        }

        return result;
    }

    private static boolean matches(String query, String pattern){
        int i = 0;
        for(int j = 0; j < query.length(); j++){
            char qc = query.charAt(j);

            if(i < pattern.length() && qc == pattern.charAt(i)){
                i++;
            }else if(Character.isUpperCase(qc)){
                return false;
            }
        }
        return i == pattern.length();
    }
}