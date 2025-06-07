package Day_7.TheCelebrityProblem;

import java.util.Stack;

class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            stack.push(i);
        }

        while(stack.size() > 1){
            int A = stack.pop();
            int B = stack.pop();

            if(mat[A][B] == 1){
                stack.push(B);
            }else{
                stack.push(A);
            }
        }
        int c = stack.pop();
        for(int i = 0; i < n; i++){
            if(i != c){
                if(mat[c][i] == 1 || mat[i][c] == 0){
                    return -1;
                }
            }
        }
        return c;
    }
}
