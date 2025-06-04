# 📦 CustomStack - Design a Stack With Increment Operation

> LeetCode Problem 1381 - Medium  
> Tags: Stack, Design

---

## 🧠 Problem Description

Design a stack that supports **increment operations** on its elements.

### Class: `CustomStack`

#### Constructor

```python
CustomStack(int maxSize)
Initializes the stack with a maximum size of maxSize.

Methods

Edit
void push(int x)
Pushes x onto the stack if it hasn't reached the maxSize.


int pop()
Removes and returns the top of the stack.

Returns -1 if the stack is empty.


void increment(int k, int val)
Increments the bottom k elements of the stack by val.

If the stack has fewer than k elements, increment all of them.

🧪 Example

Input:
["CustomStack","push","push","pop","push","push","push","increment","increment","pop","pop","pop","pop"]
[[3],[1],[2],[],[2],[3],[4],[5,100],[2,100],[],[],[],[]]

Output:
[null,null,null,2,null,null,null,null,null,103,202,201,-1]
Step-by-step:

CustomStack stk = CustomStack(3)     # Stack: []
stk.push(1)                          # Stack: [1]
stk.push(2)                          # Stack: [1, 2]
stk.pop()                            # Returns 2, Stack: [1]
stk.push(2)                          # Stack: [1, 2]
stk.push(3)                          # Stack: [1, 2, 3]
stk.push(4)                          # Stack: [1, 2, 3] (ignored, max size = 3)
stk.increment(5, 100)                # Stack: [101, 102, 103]
stk.increment(2, 100)                # Stack: [201, 202, 103]
stk.pop()                            # Returns 103, Stack: [201, 202]
stk.pop()                            # Returns 202, Stack: [201]
stk.pop()                            # Returns 201, Stack: []
stk.pop()                            # Returns -1 (empty stack)