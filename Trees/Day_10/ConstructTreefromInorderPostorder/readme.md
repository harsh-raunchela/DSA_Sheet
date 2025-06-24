# 🌳 LeetCode 106: Construct Binary Tree from Inorder and Postorder Traversal

**Difficulty:** Medium  
**Tags:** Binary Tree, Recursion, DFS  
**Status:** ✅ Solved

---

## 🧠 Problem Statement

Given two integer arrays `inorder` and `postorder` representing the inorder and postorder traversal of a binary tree, construct and return the **binary tree**.

---

## 📥 Example 1

**Input:**
inorder = [9,3,15,20,7]
postorder = [9,15,7,20,3]

**Output:**  
[3,9,20,null,null,15,7]

---

## 📥 Example 2

**Input:**
inorder = [-1]
postorder = [-1]


**Output:**  
[-1]


---

## 📌 Constraints

- `1 <= inorder.length <= 3000`
- `postorder.length == inorder.length`
- `-3000 <= inorder[i], postorder[i] <= 3000`
- All values in `inorder` and `postorder` are **unique**
- Both arrays represent the **same binary tree**
- `inorder` is a valid inorder traversal
- `postorder` is a valid postorder traversal

---

## 🧩 Approach

We use **recursion** and a **hashmap** to efficiently rebuild the tree:

1. The **last element** in `postorder` is the 