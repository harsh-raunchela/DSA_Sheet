# 🔢 Kth Largest Element in BST

**Difficulty:** Easy  
**Accuracy:** 49.31%  
**Submissions:** 169K+  
**Points:** 2

---

## 📘 Problem Statement

Given a **Binary Search Tree (BST)**, return the **Kth largest element** in the BST **without modifying** the tree.

You are expected to implement a function that works efficiently even with large datasets.

---

## 💡 Key Insight

Since BSTs store elements in a sorted order (in-order traversal gives ascending order), a **reverse in-order traversal (Right → Node → Left)** gives elements in **descending order**.

By traversing this way and counting nodes, the **kth node visited** will be the **kth largest**.

---

## 🧪 Examples

### Example 1:

4
/   \
2 9
k = 2


**Output:** `4`  
**Explanation:** The elements in descending order are [9, 4, 2]. The 2nd largest is `4`.

---

### Example 2:

9
\
10
k = 1

**Output:** `10`  
**Explanation:** The largest element is `10`.

---

### Example 3:

4
/   \
2 9
k = 3

**Output:** `2`  
**Explanation:** The elements in descending order are [9, 4, 2]. The 3rd largest is `2`.

---

## 🧾 Constraints

- `1 <= Number of nodes <= 10^5`
- `1 <= Node->data <= 10^5`
- `1 <= k <= Number of nodes`

---
