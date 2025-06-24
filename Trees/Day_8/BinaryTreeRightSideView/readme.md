# 🌳 LeetCode 199: Binary Tree Right Side View

## 🧠 Problem Summary
Imagine you're standing on the **right side** of a binary tree — your goal is to return the **nodes you can see**, from **top to bottom**.

### ✨ Input:
- A binary tree (root node).
- Tree nodes follow the format of `[val, left, right]`, using `null` for empty branches.

### 📤 Output:
- A list of node values visible from the **right side view**, ordered top-down.

---

## 🔍 Examples

### 📘 Example 1
**Input:**  
`root = [1,2,3,null,5,null,4]`  
**Output:**  
`[1,3,4]`  
**Why?** From the right side, you see:

1
\
3
\
4


### 📘 Example 2
**Input:**  
`root = [1,2,3,4,null,null,null,5]`  
**Output:**  
`[1,3,4,5]`

### 📘 Example 3
**Input:**  
`root = [1,null,3]`  
**Output:**  
`[1,3]`

### 📘 Example 4
**Input:**  
`root = []`  
**Output:**  
`[]`

---

## 🧩 Constraints
- Tree node count: `0 <= nodes <= 100`
- Node values range: `-100 <= val <= 100`

---