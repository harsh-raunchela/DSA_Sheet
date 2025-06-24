package Day_6.SymmetricTree;

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
    public boolean isSymmetric(TreeNode root) {
        return root == null || checkSymm(root.left, root.right);
    }
    private static boolean checkSymm(TreeNode left, TreeNode right){
        if(left == null || right == null) return left == right;

        if(left.val != right.val) return false;

        return checkSymm(left.left, right.right) && checkSymm(left.right, right.left);
    }
}
