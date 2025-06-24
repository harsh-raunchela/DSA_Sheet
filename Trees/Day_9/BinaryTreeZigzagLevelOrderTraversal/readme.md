# 🔁 Leetcode 103. Binary Tree Zigzag Level Order Traversal

**Difficulty:** Medium  
**Tags:** Tree, BFS, Level Order Traversal, Zigzag  
**Leetcode Link:** [Leetcode 103](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)

---

## 🧠 Problem Statement

Given the `root` of a binary tree, return the **zigzag level order traversal** of its nodes' values.

In other words:
- Traverse the tree **level by level**, but
- **Alternate** the direction:
    - Left to Right ➡️
    - Right to Left ⬅️
    - Left to Right ➡️ ... and so on.

---

## 🧪 Examples

### Example 1:
**Input:**  
`root = [3,9,20,null,null,15,7]`



**Output:**  
`[[3], [20, 9], [15, 7]]`

---

### Example 2:
**Input:**  
`root = [1]`  
**Output:**  
`[[1]]`

---

### Example 3:
**Input:**  
`root = []`  
**Output:**  
`[]`

---

## ✅ Constraints

- The number of nodes is in the range `[0, 2000]`
- `-100 <= Node.val <= 100`

---