package Day_10.NextGreaterNodeInLinkedList;

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
    public int[] nextLargerNodes(ListNode head) {
        // Convert linked list to list
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        int n = values.size();
        int[] result = new int[n];

        // Brute force: For each element, find the next greater
        for (int i = 0; i < n; i++) {
            int curr = values.get(i);
            for (int j = i + 1; j < n; j++) {
                if (values.get(j) > curr) {
                    result[i] = values.get(j);
                    break; // Found the next greater, break
                }
            }
        }

        return result;
    }
}