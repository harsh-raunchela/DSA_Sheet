package Day_7.SwappingNodesinaLinkedList;

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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        int length = 0;

        //find the length
        ListNode current = head;
        while(current != null){
            length++;
            current = current.next;
        }

        first = head;
        for(int i = 1; i < k; i++){
            first = first.next;
        }

        ListNode second = head;
        for(int i = 1; i < length - k + 1; i++){
            second = second.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}