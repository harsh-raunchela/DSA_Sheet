package Day_5.DiameterofBinaryTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    private static int height(TreeNode root, int[] diameter){
        if(root == null) return 0;

        int leftH = height(root.left, diameter);
        int rightH = height(root.right, diameter);

        diameter[0] = Math.max(diameter[0], leftH + rightH);
        return 1  + Math.max(leftH, rightH);
    }
}