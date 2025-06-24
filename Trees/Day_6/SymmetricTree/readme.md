# 🌲 101. Symmetric Tree

> Status: ✅ Solved | Difficulty: 🟢 Easy  
> Tags: Tree, DFS, BFS, Recursion  
> Language: Python / Java / C++ / any language of your choice

---

## 🧠 Problem Statement

Given the `root` of a **binary tree**, check whether it's **symmetric around its center** – in other words, determine if it's a **mirror** of itself.

---

## 🔁 Symmetry Explained

Imagine folding the tree down the middle vertically – if both sides look the same, it's symmetric.

### ✅ Example 1:

1
/ \
2   2
/ \ / \
3  4 4  3
Input: [1,2,2,3,4,4,3]
Output: true



### ❌ Example 2:
markdown
Copy
Edit
1
/ \
2   2
\   \
3   3
Input: [1,2,2,null,3,null,3]
Output: false


---

## 📦 Constraints

- Number of nodes: `1 <= n <= 1000`
- Node values: `-100 <= val <= 100`

---