package Day_6.DesignFrontMiddleBackQueue;

import java.util.ArrayDeque;
import java.util.Deque;

class FrontMiddleBackQueue {
    Deque<Integer> left;
    Deque<Integer> right;

    public FrontMiddleBackQueue() {
        left = new ArrayDeque<>();
        right = new ArrayDeque<>();
    }

    public void balance(){
        while(left.size() > right.size() + 1){
            right.addFirst(left.pollLast());
        }
        while(left.size() < right.size()){
            left.addLast(right.pollFirst());
        }
    }

    public void pushFront(int val) {
        left.addFirst(val);
        balance();
    }

    public void pushMiddle(int val) {
        if(left.size() > right.size()){
            right.addFirst(left.pollLast());
        }
        left.addLast(val);
        balance();
    }

    public void pushBack(int val) {
        right.addLast(val);
        balance();
    }

    public int popFront() {
        if(left.isEmpty() && right.isEmpty()) return -1;
        int val = left.isEmpty() ? right.pollFirst() : left.pollFirst();
        balance();
        return val;
    }

    public int popMiddle() {
        if(left.isEmpty() && right.isEmpty()) return -1;
        int val = left.pollLast();
        balance();
        return val;
    }

    public int popBack() {
        if(left.isEmpty() && right.isEmpty()) return -1;
        int val = right.isEmpty() ? left.pollLast() : right.pollLast();
        balance();
        return val;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
