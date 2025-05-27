# 🔄 1721. Swapping Nodes in a Linked List

**Difficulty:** Medium  
**Topics:** Linked List, Two Pointers  
**Companies:** Amazon, Microsoft, Bloomberg

---

## 🧠 Problem Statement

You're given the `head` of a singly linked list and an integer `k`.  
Swap the values of:
- The **k-th node from the beginning**
- The **k-th node from the end**  
  Then return the head of the modified list.

> 📌 Note: The list is **1-indexed** (starts from 1).

---

## 🧪 Examples

### Example 1:
```python
Input:  head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]


Example 2:

Input:  head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]