# 🌳 112. Path Sum

> **Difficulty:** Easy  
> **Topics:** Tree, DFS, Recursion  
> **Link:** [LeetCode - Path Sum](https://leetcode.com/problems/path-sum/)

---

## 🧠 Problem

Given the `root` of a binary tree and an integer `targetSum`, return `true` if the tree has a **root-to-leaf path** such that adding up all the values along the path equals `targetSum`.

> A **leaf** is a node with no children.

---

## 📥 Examples

### ✅ Example 1
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is:
5 → 4 → 11 → 2 = 22


### ❌ Example 2
Input: root = [1,2,3], targetSum = 5
Output: false
Explanation:
Paths:
1 → 2 = 3
1 → 3 = 4
No path adds up to 5.

### ❌ Example 3
Input: root = [], targetSum = 0
Output: false
Explanation: The tree is empty, so no paths exist.

---

## 📌 Constraints

- The number of nodes: `0 <= nodes <= 5000`
- Node values: `-1000 <= Node.val <= 1000`
- Target sum: `-1000 <= targetSum <= 1000`

---