package MaxValueofEquation;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int maxResult = Integer.MIN_VALUE;

        //deque to maintain candidates of (yi - xi, xi)
        Deque<int[]> deque = new ArrayDeque<>();

        for(int[] point : points){
            int x = point[0], y = point[1];

            //remove points where xj - xi > k
            while(!deque.isEmpty() && x - deque.peekFirst()[1] > k){
                deque.pollFirst();
            }

            //if deque not empty, calculate potential max value
            if(!deque.isEmpty()) {
                int[] best = deque.peekFirst();
                maxResult = Math.max(maxResult, best[0] + y + x);
            }

            //remove worse (smaller) candidates from deque end
            while(!deque.isEmpty() && deque.peekLast()[0] <= y - x){
                deque.pollLast();
            }

            deque.offerLast(new int[]{y - x, x});
        }
        return maxResult;
    }
}
