package Day_9.SplitLinkedListinParts;

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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int totalLength = 0;
        ListNode current = head;

        while(current != null){
            totalLength++;
            current = current.next;
        }

        int baseSize = totalLength/k;
        int extra = totalLength % k;

        current = head;
        for(int i = 0; i < k; i++){
            ListNode partHead = current;
            int currentPartSize = baseSize + (i < extra ? 1 : 0);

            for(int j = 0; j < currentPartSize - 1; j++){
                if(current != null) current = current.next;
            }

            if(current != null){
                ListNode next = current.next;
                current.next = null;
                current = next;
            }
            result[i] = partHead;
        }
        return result;
    }
}