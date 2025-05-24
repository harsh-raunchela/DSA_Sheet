package Day_5.DeleteNodeinaLinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // Overwrite current node with next node
        node.val = node.next.val;
        // Skip over the next node
        node.next = node.next.next;
    }
}