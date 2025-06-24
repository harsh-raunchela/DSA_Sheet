# 🌳 257. Binary Tree Paths

> **Difficulty:** Easy  
> **LeetCode Link:** [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)  
> **Category:** Tree Traversal, DFS  
> **Language:** Python / Java / C++ / etc.

---

## 🧠 Problem Summary

Given the `root` of a binary tree, return **all** root-to-leaf paths in **any order**.

> **Leaf** = a node that has no children.

---

## 📥 Input

- A binary tree represented as a list.
- Example:  
  `root = [1,2,3,null,5]`

---

## 📤 Output

- A list of strings, each string is a root-to-leaf path joined by `"->"`.

---

## 📸 Examples

### Example 1

Input: root = [1,2,3,null,5]


1
/ \
2   3
\
5
Output: ["1->2->5", "1->3"]



### Example 2

Input: root = [1]

Output: ["1"]


---

## 🔒 Constraints

- Number of nodes: `1 <= n <= 100`
- Node values: `-100 <= val <= 100`

---