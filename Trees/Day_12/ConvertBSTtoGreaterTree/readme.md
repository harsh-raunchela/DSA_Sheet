# 🌳 538. Convert BST to Greater Tree

## 🧩 Problem Statement

Given the `root` of a Binary Search Tree (BST), convert it to a **Greater Tree** such that every node’s value is changed to the original value **plus the sum of all keys greater than the original key** in the BST.

> A Binary Search Tree (BST) satisfies:
>
> - Left subtree of a node contains only nodes with keys less than the node's key.
> - Right subtree of a node contains only nodes with keys greater than the node's key.
> - Both left and right subtrees are also BSTs.

---

## 💡 Examples

### Example 1:
**Input:**
[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]


**Output:**
[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]


### Example 2:
**Input:**
[0,null,1]


**Output:**
[1,null,1]


---

## 📏 Constraints

- `0 <= Number of nodes <= 10^4`
- `-10^4 <= Node.val <= 10^4`
- All values in the tree are **unique**
- The input is a valid Binary Search Tree

---
