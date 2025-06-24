# 🌲 114. Flatten Binary Tree to Linked List

**Difficulty:** Medium  
**Topic Tags:** Tree, DFS, Binary Tree, Linked List, In-Place  
**Link:** [LeetCode 114](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)

---

## 🧠 Problem Statement

Given the `root` of a binary tree, flatten the tree into a "linked list" **in-place**.

- Use the same `TreeNode` class where the `.right` child points to the next node in the list, and `.left` is always `null`.
- The flattened list should follow the **pre-order traversal** of the binary tree.

---

## 🖼️ Examples

### Example 1

**Input:**
root = [1,2,5,3,4,null,6]


**Output:**
[1,null,2,null,3,null,4,null,5,null,6]


**Visual Tree Before:**
Copy code
1
/ \
2 5
/ \
3 4 6



**After Flattening:**
1

2

3

4

5

6


### Example 2
**Input:** `root = []`  
**Output:** `[]`

### Example 3
**Input:** `root = [0]`  
**Output:** `[0]`

---

## ✅ Constraints

- `0 <= Number of nodes <= 2000`
- `-100 <= Node.val <= 100`

---