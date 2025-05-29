# 🧩 Leetcode 725: Split Linked List in Parts

## 💬 Problem Statement

Given the head of a **singly linked list** and an integer `k`, split the list into `k` consecutive linked list parts.

### Rules:

- Each part should be **as equal in length as possible**.
- The length of any two parts should **not differ by more than 1**.
- **Earlier parts must be greater than or equal in size** compared to later parts.
- Some parts may be `null` (if the number of nodes < k).
- The parts must preserve the original order of nodes.

---

## 📘 Examples

### Example 1:
```java
Input: head = [1,2,3], k = 5

Output: [[1], [2], [3], [], []]


Example 2:

Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3

Output: [[1,2,3,4], [5,6,7], [8,9,10]]