package Day_2.NextgreaterelementI;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> ngeMap = new HashMap<>();

        for(int num : nums2){
            while(!stack.isEmpty() && num > stack.peek()){
                int prev = stack.pop();
                ngeMap.put(prev, num);
            }
            stack.push(num);
        }

        while(!stack.isEmpty()){
            ngeMap.put(stack.pop(), -1);
        }

        int[] result = new int[nums1.length];
        for(int i =0; i < nums1.length; i++){
            result[i] = ngeMap.get(nums1[i]);
        }
        return result;
    }
}
