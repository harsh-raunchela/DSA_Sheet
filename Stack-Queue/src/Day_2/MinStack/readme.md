# 🧠 155. Min Stack

**Difficulty:** Medium  
**Tag:** Stack  
**Topic:** Design Data Structure  
**Goal:** Support `push`, `pop`, `top`, and `getMin` in **O(1)** time!

---

## 📘 Problem Statement

Design a stack that supports:
- `push(int val)`
- `pop()`
- `top()`
- `getMin()`

All operations should run in **constant time O(1)**.

### ✅ Requirements

- Implement a class `MinStack`.
- Must keep track of the **minimum element** in the stack at all times.
- Efficiently handle up to `3 * 10⁴` operations.

---

## 🧪 Example

```java
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // returns -3
minStack.pop();
minStack.top();    // returns 0
minStack.getMin(); // returns -2
