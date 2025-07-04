235. Lowest Common Ancestor of a Binary Search Tree 🧬🌳

## 🚀 Problem Statement

Given a **Binary Search Tree (BST)**, find the **lowest common ancestor (LCA)** of two given nodes `p` and `q`.

> According to [Wikipedia](https://en.wikipedia.org/wiki/Lowest_common_ancestor):  
> "The lowest common ancestor is defined between two nodes `p` and `q` as the lowest node in `T` that has both `p` and `q` as descendants (where we allow a node to be a descendant of itself)."

---

## 📘 Examples

### Example 1:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6


6
/   \
2     8
/ \   / \
0 4 7 9
/
3 5


**Explanation:** The LCA of nodes 2 and 8 is 6.

---

### Example 2:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2


**Explanation:** The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself.

---

### Example 3:
Input: root = [2,1], p = 2, q = 1
Output: 2