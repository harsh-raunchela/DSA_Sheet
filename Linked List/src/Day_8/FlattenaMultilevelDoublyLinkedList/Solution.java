package Day_8.FlattenaMultilevelDoublyLinkedList;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;

        Node curr = head;

        while(curr != null){
            if(curr.child == null){
                curr = curr.next;
                continue;
            }

            //Save next node
            Node next = curr.next;

            //flatten the child
            Node child = flatten(curr.child);

            //Connect current to the child
            curr.next = child;
            child.prev = curr;
            curr.child = null;

            //move to the tail of child
            Node tail = child;
            while(tail.next != null){
                tail = tail.next;
            }

            //reconnect the tail and next
            tail.next = next;
            if(next != null){
                next.prev = tail;
            }

            curr = curr.next;
        }
        return head;
    }
}