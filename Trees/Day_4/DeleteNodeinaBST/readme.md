🧩 450. Delete Node in a Binary Search Tree

**Difficulty**: Medium  
**Topics**: Binary Tree, Binary Search Tree, Recursion

---

## 📘 Problem Statement

Given a reference to the root of a **Binary Search Tree (BST)** and an integer `key`, delete the node with that value and return the updated root of the BST.

BST deletion is done in **two stages**:
1. **Search** for the node to delete.
2. **Delete** it following BST rules.

---

## 🧠 Deletion Cases

1. **Node not found** → return original tree.
2. **Node is a leaf** → remove it.
3. **Node has one child** → replace with its child.
4. **Node has two children** →
    - Find the **in-order successor** (smallest node in the right subtree),
    - Replace node’s value with successor’s value,
    - Recursively delete the successor.

---

## 🔍 Examples

### ✅ Example 1
Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation:
Deleted node 3 (has two children).
Replaced with in-order successor 4.



### ✅ Example 2
Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]
Explanation:
No node with value 0 exists → tree unchanged.



### ✅ Example 3
Input: root = [], key = 0
Output: []
Explanation:
Empty tree remains empty.