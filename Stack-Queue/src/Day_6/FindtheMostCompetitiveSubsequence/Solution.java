package Day_6.FindtheMostCompetitiveSubsequence;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && nums[i] < stack.peekLast() && stack.size() + (n - i) > k){
                stack.pollLast();
            }

            if(stack.size() < k){
                stack.addLast(nums[i]);
            }
        }

        int[] result = new int[k];
        int i = 0;
        for(int num : stack){
            result[i++] = num;
        }
        return result;
    }
}