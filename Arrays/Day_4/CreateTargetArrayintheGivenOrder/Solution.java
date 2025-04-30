package Day_4.CreateTargetArrayintheGivenOrder;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int result[] = new int[n];

        for(int i = 0; i < n; i++){
            list.add(index[i], nums[i]);
        }
        for(int i = 0; i<n; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
