# 🧬 Ancestors in Binary Tree (Java)

A Java solution to find all the ancestors of a given target node in a binary tree. Ancestors are nodes that lie on the path from the root to the target, excluding the target itself.

---

## 🧠 Problem Statement

Given a binary tree and a target node value, return a list of all its ancestors. The list should be in order from immediate parent to the root.

### ✅ Constraints:
- 1 ≤ Number of nodes ≤ 10³
- 1 ≤ Node data ≤ 10⁴
- Expected Time Complexity: O(n)
- Expected Space Complexity: O(h) *(height of tree)*

---

## 🌳 Example

### Input Tree:

1
/   \
2     3
/ \   / \
4   5 6   8
/
7



### Target: `7`

### Output:
[4, 2, 1]