package Day_8.TopViewofBinaryTree;

import java.util.*;

// Tree Node class
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

class Pair {
    TreeNode node;
    int hd; // horizontal distance

    Pair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class Solution {

    public List<Integer> topView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Map to store first node at every horizontal distance
        Map<Integer, Integer> topNodes = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0)); // root at hd 0

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            TreeNode node = current.node;
            int hd = current.hd;

            // Only add the first node encountered at each horizontal distance
            if (!topNodes.containsKey(hd)) {
                topNodes.put(hd, node.val);
            }

            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }

            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }

        // Extract the result from leftmost to rightmost
        for (int val : topNodes.values()) {
            result.add(val);
        }

        return result;
    }
}
