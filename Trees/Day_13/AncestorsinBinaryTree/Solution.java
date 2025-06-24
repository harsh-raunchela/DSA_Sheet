package Day_13.AncestorsinBinaryTree;

class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> findAncestors(Node root, int target) {
        helper(root, target);
        return result;
    }

    private boolean helper(Node node, int target) {
        if (node == null)
            return false;

        if (node.data == target)
            return true;

        // Check left and right subtrees
        if (helper(node.left, target) || helper(node.right, target)) {
            result.add(node.data); // Current node is an ancestor
            return true;
        }

        return false;
    }
}
