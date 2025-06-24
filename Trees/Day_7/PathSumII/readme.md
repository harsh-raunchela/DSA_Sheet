# 🌳 113. Path Sum II

> **Difficulty:** Medium  
> **Topics:** Tree, DFS, Backtracking  
> **Link:** [LeetCode - Path Sum II](https://leetcode.com/problems/path-sum-ii/)

---

## 🧠 Problem

Given the `root` of a binary tree and an integer `targetSum`, return **all** root-to-leaf paths where the sum of the node values in the path equals `targetSum`.

Each path should be returned as a **list of values**, not node references.

> A **leaf** is a node with no children.  
> A **root-to-leaf path** starts at the root and ends at a leaf.

---

## 📥 Examples

### ✅ Example 1
Input:
root = [5,4,8,11,null,13,4,7,2,null,null,5,1]
targetSum = 22

Output: [[5,4,11,2],[5,8,4,5]]

Explanation:
Paths that sum to 22:

5 → 4 → 11 → 2

5 → 8 → 4 → 5

### ❌ Example 2
Input: root = [1,2,3], targetSum = 5
Output: []


### ❌ Example 3
Input: root = [1,2], targetSum = 0
Output: []

---

## 📌 Constraints

- `0 <= number of nodes <= 5000`
- `-1000 <= Node.val <= 1000`
- `-1000 <= targetSum <= 1000`

---