# 230. Kth Smallest Element in a BST

> 🟢 Solved | 🟠 Medium  
> **Tags**: Tree, Binary Search Tree, DFS, Inorder Traversal  
> **Companies**: Google, Facebook, Amazon, Microsoft

---

## 🧠 Problem

Given the `root` of a binary search tree, and an integer `k`, return the **kth smallest** value (1-indexed) of all the values of the nodes in the tree.

---

## 📥 Input

- `root`: A binary search tree
- `k`: An integer (1-based index)

---

## 📤 Output

- Returns the `k`th smallest node value in the BST

---

## 🧪 Examples

### Example 1:
Input: root = [3,1,4,null,2], k = 1
Output: 1

### Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3


---

## 🔒 Constraints

- The number of nodes in the tree is `n`.
- `1 <= k <= n <= 10^4`
- `0 <= Node.val <= 10^4`

---