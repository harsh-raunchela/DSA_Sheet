# ✅ Validate Binary Search Tree

**Difficulty**: Medium  
**Tags**: Tree, DFS, Recursion  
**LeetCode ID**: 98
<!-- This isn't problem 8, it's actually 98 on LeetCode -->

---

## 🧩 Problem

Given the `root` of a binary tree, determine if it is a **valid Binary Search Tree (BST)**.

### BST Rules:
- The left subtree of a node contains only nodes with **keys less than** the node’s key.
- The right subtree contains only nodes with **keys greater than** the node’s key.
- **Both** subtrees must also be valid BSTs.

---

## 💡 Examples

### Example 1:
```txt
Input: root = [2, 1, 3]
Output: true
Example 2:

Input: root = [5, 1, 4, null, null, 3, 6]
Output: false
Explanation: The root node's value is 5, but the right child's value is 4.
