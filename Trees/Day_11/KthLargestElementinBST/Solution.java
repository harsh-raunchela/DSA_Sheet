package Day_11.KthLargestElementinBST;

class Solution {
    int count = 0, result = -1;

    public int kthLargest(TreeNode root, int k) {
        reverseInorder(root, k);
        return result;
    }

    public void reverseInorder(TreeNode node, int k) {
        if (node == null) return;

        reverseInorder(node.right, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        reverseInorder(node.left, k);
    }
}
