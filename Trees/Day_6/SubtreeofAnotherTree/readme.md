# 🌳 LeetCode 572: Subtree of Another Tree

**Difficulty**: Easy  
**Topics**: Binary Tree, Recursion, DFS

---

## 🧩 Problem Statement

Given the roots of two binary trees `root` and `subRoot`, return `true` if there is a subtree of `root` with the same structure and node values as `subRoot`, and `false` otherwise.

> A **subtree** of a binary tree `tree` is a node in `tree` and all of that node’s descendants.  
> The tree itself is also considered a valid subtree.

---

## 🧪 Examples

### ✅ Example 1:
```text
Input: 
root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true
❌ Example 2:

Input: 
root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
Output: false