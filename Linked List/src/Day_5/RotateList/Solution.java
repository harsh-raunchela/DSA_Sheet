package Day_5.RotateList;

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        //step 1: compute the length and get the tail
        ListNode tail = head;
        int length = 1;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        //step 2: adjust k
        k %= length;
        if(k == 0) return head;

        //step 3:find the new tail
        ListNode newTail = head;
        for(int i = 1; i < length - k; i++){
            newTail = newTail.next;
        }

        //step 4:rearrange pointers
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}