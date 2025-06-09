# 🟢 94. Binary Tree Inorder Traversal

**Difficulty:** Easy  
**Tags:** Binary Tree, DFS, Recursion, Stack

## 📘 Problem Statement

Given the `root` of a binary tree, return the **inorder traversal** of its nodes' values.

In an **inorder traversal**, the nodes are recursively visited in this order:

1. Left Subtree
2. Root
3. Right Subtree

---

## 📥 Examples

### Example 1
**Input:**  
`root = [1,null,2,3]`  
**Output:**  
`[1, 3, 2]`  
**Explanation:**
- First, visit the left subtree (null)
- Then, the root (1)
- Move to right subtree (2 → 3)
- Inorder: 3 before 2

---

### Example 2
**Input:**  
`root = [1,2,3,4,5,null,8,null,null,6,7,9]`  
**Output:**  
`[4, 2, 6, 5, 7, 1, 3, 9, 8]`  
**Explanation:**  
Inorder traversal of the given complex tree returns that sequence.

---

### Example 3
**Input:**  
`root = []`  
**Output:**  
`[]`

---

### Example 4
**Input:**  
`root = [1]`  
**Output:**  
`[1]`

---