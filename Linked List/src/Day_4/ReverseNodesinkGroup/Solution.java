package Day_4.ReverseNodesinkGroup;

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
    public ListNode reverseKGroup(ListNode head, int k) {
        //step 1: check if we have k nodes to reverse
        ListNode temp = head;
        for(int i= 0; i < k; i++){
            if(temp == null)return head;
            temp = temp.next;
        }

        //step 2: reverse k nodes
        ListNode prev = null, curr = head, next = null;
        int count = 0;

        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        //step 3: recurse the remaining nodes or list
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}