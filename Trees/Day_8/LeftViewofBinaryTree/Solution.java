package Day_8.LeftViewofBinaryTree;

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        lsv(root, res, 0);
        return res;
    }

    private static void lsv(Node root, List<Integer> res, int level){
        if(root == null)return;

        if(level == res.size()){
            res.add(root.data);
        }
        lsv(root.left,res, level + 1);
        lsv(root.right, res, level + 1);
    }
}
