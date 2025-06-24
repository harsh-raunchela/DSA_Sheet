# 🪞 226. Invert Binary Tree

**Difficulty:** Easy  
**Category:** Binary Tree | Recursion | DFS | BFS  
**LeetCode Link:** [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree)

---

## 🧠 Problem Statement

You're given the root of a **binary tree** — your task is to **invert** (aka mirror) the tree and return its root.

Basically, for every node, **swap its left and right subtrees**.

---

## 🌳 Examples

### Example 1

**Input:**  
`root = [4,2,7,1,3,6,9]`

**Output:**  
`[4,7,2,9,6,3,1]`

**Visual:**
Original: Inverted:
4 4
/ \ /
2 7 ---> 7 2
/ \ / \ / \ /
1 3 6 9 9 6 3 1


---

### Example 2

**Input:**  
`root = [2,1,3]`  
**Output:**  
`[2,3,1]`

---

### Example 3

**Input:**  
`root = []`  
**Output:**  
`[]`

---

## ✅ Constraints

- Number of nodes: `0 <= n <= 100`
- Node values: `-100 <= val <= 100`

---