# 🔁 141. Linked List Cycle

**Difficulty:** Easy  
**Topics:** Linked List, Two Pointers, Hashing

---

## 📝 Problem Statement

You're given the `head` of a **singly linked list**.  
Determine if the list has a **cycle** in it.

A cycle occurs when a node’s `.next` points to a previous node, forming a loop.

### ❗ Note:
- The value `pos` denotes the index where the tail connects to. It's **not passed in the function**, only for explanation.

---

## 📥 Examples

### Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: Tail connects back to node with value 2


### Example 2:

Input: head = [1,2], pos = 0
Output: true
Explanation: Tail connects back to node with value 1


### Example 3:

Input: head = [1], pos = -1
Output: false
Explanation: No cycle in the list