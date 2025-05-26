package Day_6.DesignLinkedList;

class MyLinkedList {

    private class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        //get value at index
        if(index < 0 || index >= size){
            return -1;
        }
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.val;
    }


    //add at head
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }


    //add at tail
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }


    //add at index
    public void addAtIndex(int index, int val) {
        if(index > size) return;

        if(index <= 0){
            addAtHead(val);
        }else if(index == size){
            addAtTail(val);
        }else{
            Node newNode = new Node(val);
            Node current = head;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;

        if(index == 0){
            head = head.next;
        }else{
            Node current = head;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */