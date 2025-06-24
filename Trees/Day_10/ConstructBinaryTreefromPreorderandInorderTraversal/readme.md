# 🌳 LeetCode 105 - Construct Binary Tree from Preorder and Inorder Traversal

## 🧠 Problem Statement

Given two integer arrays `preorder` and `inorder` that represent the **preorder** and **inorder** traversal of a binary tree, your task is to reconstruct the original binary tree and return its root.

---

## 🧾 Example

### Example 1:
Input:
preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]

Output:
[3,9,20,null,null,15,7]


### Example 2:
Input:
preorder = [-1]
inorder = [-1]

Output:
[-1]

---

## ✅ Constraints

- `1 <= preorder.length <= 3000`
- `preorder.length == inorder.length`
- `-3000 <= preorder[i], inorder[i] <= 3000`
- All values are **unique**
- `preorder` and `inorder` are valid traversal arrays of the same binary tree

---