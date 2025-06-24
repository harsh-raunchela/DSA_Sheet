# 🌳 Left View of Binary Tree

**Difficulty:** Easy  
**Accuracy:** 33.74%  
**Submissions:** 562K+  
**Average Time:** 20 min  
**Points:** 2

---

## 🧠 Problem Statement

You're given the root of a binary tree. Your task is to return the **left view** of the binary tree.

The **left view** of a binary tree is the set of nodes visible when the tree is viewed from the **left side**.

If the tree is empty, return an empty list.

---

## 🔍 Examples

### Example 1
```text
Input: root[] = [1, 2, 3, 4, 5, N, N]
Output: [1, 2, 4]
Explanation: From the left side, nodes 1, 2, and 4 are visible.

Example 2

Input: root[] = [1, 2, 3, N, N, 4, N, N, 5, N, N]
Output: [1, 2, 4, 5]
Explanation: Nodes 1, 2, 4, and 5 are visible from the left.

Example 3

Input: root[] = [N]
Output: []
Explanation: The tree is empty.

✅ Constraints
0 <= number of nodes <= 10^6

0 <= node.data <= 10^5