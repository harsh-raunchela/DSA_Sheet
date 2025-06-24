package Day_14.Maximumpathsumfromanynode;

/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node) {
        // your code goes here
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(node, maxValue);
        return maxValue[0];
    }

    private int maxPathDown(Node node, int maxValue[]){
        if(node == null)return 0;

        int leftSum = Math.max(0, maxPathDown(node.left, maxValue));
        int rightSum = Math.max(0, maxPathDown(node.right, maxValue));

        maxValue[0] = Math.max(maxValue[0], leftSum + rightSum + node.data);

        return Math.max(leftSum, rightSum) + node.data;
    }
}
