package Day_4.ReverseLinkedListII;

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;

        //Dummy node to handle edge case where left == 1
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        //Step 1:Reach the node just before 'left'
        ListNode prev = dummy;
        for(int i = 0; i < left - 1; i++){
            prev = prev.next;
        }

        //step 2:Start reversing form 'start'
        ListNode start = prev.next;
        ListNode then = start.next;

        //step 3:Reverse between left and right
        for(int i = 0; i < right - left; i++){
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return dummy.next;
    }
}