package Day_7.BraceExpansionII;

import java.util.*;


class Solution {
    public List<String> braceExpansionII(String expression) {
        Stack<Set<String>> stack = new Stack<>();
        Stack<Character> ops = new Stack<>();
        int n = expression.length();

        for (int i = 0; i < n; ++i) {
            char ch = expression.charAt(i);

            if (ch == '{') {
                if (i > 0 && (Character.isLetter(expression.charAt(i - 1)) || expression.charAt(i - 1) == '}')) {
                    while (!ops.isEmpty() && ops.peek() == '*') applyOp(stack, ops.pop());
                    ops.push('*');
                }
                ops.push('{');
            } else if (ch == '}') {
                while (ops.peek() != '{') {
                    applyOp(stack, ops.pop());
                }
                ops.pop(); // remove '{'
            } else if (ch == ',') {
                while (!ops.isEmpty() && ops.peek() == '*') {
                    applyOp(stack, ops.pop());
                }
                ops.push('+');
            } else if (Character.isLetter(ch)) {
                int start = i;
                StringBuilder sb = new StringBuilder();
                sb.append(ch);
                while (i + 1 < n && Character.isLetter(expression.charAt(i + 1))) {
                    sb.append(expression.charAt(++i));
                }

                // Check for implicit concat (safe version)
                if (start > 0 && (Character.isLetter(expression.charAt(start - 1)) || expression.charAt(start - 1) == '}')) {
                    while (!ops.isEmpty() && ops.peek() == '*') applyOp(stack, ops.pop());
                    ops.push('*');
                }

                Set<String> set = new HashSet<>();
                set.add(sb.toString());
                stack.push(set);
            }
        }

        while (!ops.isEmpty()) {
            applyOp(stack, ops.pop());
        }

        List<String> result = new ArrayList<>(stack.pop());
        Collections.sort(result);
        return result;
    }

    private void applyOp(Stack<Set<String>> stack, char op) {
        Set<String> b = stack.pop();
        Set<String> a = stack.pop();
        Set<String> res = new HashSet<>();

        if (op == '+') {
            res.addAll(a);
            res.addAll(b);
        } else if (op == '*') {
            for (String s1 : a) {
                for (String s2 : b) {
                    res.add(s1 + s2);
                }
            }
        }

        stack.push(res);
    }
}