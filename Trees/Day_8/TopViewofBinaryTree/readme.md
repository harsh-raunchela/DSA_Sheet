# 🌳 Top View of Binary Tree

> Get the eagle-eye view of a binary tree. Return only the nodes visible from the top — no underground scenes allowed. 😎

## 📌 Problem Statement

Given the `root` of a binary tree, return the **top view** of the binary tree.

The **top view** is the set of nodes visible when the tree is viewed from directly above. Nodes are returned from **leftmost** to **rightmost**. If two nodes overlap vertically, the one that appears first in **level-order from the left** gets the spot.

### ✅ Constraints

- Input: `Binary Tree Node`
- Output: `List of visible node values (left to right)`
- Left-biased: If two nodes have the same horizontal distance, pick the topmost & leftmost one.

---

## 🧠 Example

```python
Input: root = [1, 2, 3, 4, 5, 6, 7]

       1
      / \
     2   3
    / \ / \
   4  5 6  7

Output: [4, 2, 1, 3, 7]
Explanation: From the top, the visible nodes are 4 → 2 → 1 → 3 → 7.