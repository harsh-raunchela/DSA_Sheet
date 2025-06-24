🌲 987. Vertical Order Traversal of a Binary Tree

**Difficulty**: Hard  
**Tags**: Binary Tree, BFS, Sorting, PriorityQueue, TreeMap  
**Platform**: LeetCode  
**Problem Link**: [LeetCode 987](https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/)

---

## 🧠 Problem Statement

Given the root of a binary tree, return its **vertical order traversal**.

Each node in the tree is assigned a position based on the rules:

- The root is at position `(0, 0)`
- The left child of a node at `(r, c)` is at `(r + 1, c - 1)`
- The right child is at `(r + 1, c + 1)`

The vertical order traversal requires:
- Sorting columns from left to right
- Sorting nodes within each column from top to bottom
- Sorting by node values if multiple nodes share the same position

---

## 🧪 Examples

### 🔹 Example 1
Input: root = [3,9,20,null,null,15,7]
Output: [[9],[3,15],[20],[7]]


### 🔹 Example 2
Input: root = [1,2,3,4,5,6,7]
Output: [[4],[2],[1,5,6],[3],[7]]



### 🔹 Example 3
Input: root = [1,2,3,4,6,5,7]
Output: [[4],[2],[1,5,6],[3],[7]]



---

## 📋 Constraints

- `1 <= Number of nodes <= 1000`
- `0 <= Node.val <= 1000`

---