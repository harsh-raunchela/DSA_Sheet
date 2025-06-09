# 🔢 LeetCode 144 - Binary Tree Preorder Traversal

> Difficulty: 🟢 Easy  
> Topics: Tree, DFS, Stack

## 📌 Problem Statement

Given the `root` of a **binary tree**, return the **preorder traversal** of its nodes' values.

**Preorder traversal** means:
1. Visit the root node
2. Traverse the left subtree
3. Traverse the right subtree

---

## 🧪 Examples

### ✅ Example 1:
**Input:**  
`root = [1, null, 2, 3]`  
**Output:**  
`[1, 2, 3]`  
**Explanation:**  
Start at root → visit `1`, move to right → visit `2`, then left → visit `3`.

---

### ✅ Example 2:
**Input:**  
`root = [1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9]`  
**Output:**  
`[1, 2, 4, 5, 6, 7, 3, 8, 9]`

---

### ✅ Example 3:
**Input:**  
`root = []`  
**Output:**  
`[]`

---

### ✅ Example 4:
**Input:**  
`root = [1]`  
**Output:**  
`[1]`

---

## 📏 Constraints

- Number of nodes: `0 <= nodes <= 100`
- Node values range: `-100 <= Node.val <= 100`

---