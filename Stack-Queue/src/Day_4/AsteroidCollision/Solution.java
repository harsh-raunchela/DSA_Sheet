package Day_4.AsteroidCollision;

import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            boolean exploded = false;

            // Check collision only if current asteroid is moving left and top of stack is moving right
            while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                int top = stack.peek();

                if (top < -ast) {
                    // Top asteroid explodes, pop it
                    stack.pop();
                } else if (top == -ast) {
                    // Both explode
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                    // Current asteroid explodes
                    exploded = true;
                    break;
                }
            }

            if (!exploded) {
                stack.push(ast);
            }
        }

        // Build result array from stack
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
