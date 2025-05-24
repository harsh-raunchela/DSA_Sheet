package Day_5.RemoveLinkedListElements;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Dummy node to handle head removals easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node
            } else {
                current = current.next; // Move to next node
            }
        }

        return dummy.next;
    }
}