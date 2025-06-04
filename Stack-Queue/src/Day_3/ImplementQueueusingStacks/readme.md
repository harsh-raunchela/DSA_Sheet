# 🚀 LeetCode 232: Implement Queue using Stacks

**Difficulty:** Easy  
**Topic Tags:** Stack, Queue, Data Structures  
**Companies Asked In:** Amazon, Google, Microsoft, Facebook

---

## 🧠 Problem Statement

Design a **First In First Out (FIFO)** queue using only **two stacks**. The implemented queue should support all the operations of a standard queue:

- `void push(int x)`: Pushes element `x` to the back of the queue.
- `int pop()`: Removes and returns the element from the front.
- `int peek()`: Returns the front element without removing it.
- `boolean empty()`: Returns `true` if the queue is empty, otherwise `false`.

### ⚠️ Constraints:
- Only use **standard stack operations**:
    - `push()`, `pop()`, `peek()`, `isEmpty()`, and `size()`
- Up to **100 function calls**.
- `1 <= x <= 9`

---

## 📦 Example

```java
Input:
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]

Output:
[null, null, null, 1, 1, false]

// Explanation:
MyQueue myQueue = new MyQueue();
myQueue.push(1);      // queue: [1]
myQueue.push(2);      // queue: [1, 2]
myQueue.peek();       // return 1
myQueue.pop();        // return 1, queue: [2]
myQueue.empty();      // return false