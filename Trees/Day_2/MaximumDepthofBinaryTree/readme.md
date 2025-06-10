# 104. Maximum Depth of Binary Tree

**Difficulty**: Easy  
**Topic**: Trees, Depth-First Search, Recursion  
**LeetCode Link**: [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

---

## 🧠 Problem Statement

Given the `root` of a binary tree, return *its maximum depth*.

A binary tree's **maximum depth** is the number of nodes along the longest path from the **root node** down to the **farthest leaf node**.

---

## 📥 Input

- `root`: The root node of the binary tree (type: `TreeNode`)
    - TreeNode definition:
      ```java
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
      ```

---

## 📤 Output

- Returns an `int` representing the maximum depth of the binary tree.

---

## 🧪 Examples

### Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Explanation:
3
/
9 20
/
15 7
The longest path from root to leaf is: 3 → 20 → 15 (or 3 → 20 → 7)


### Example 2:
Input: root = [1,null,2]
Output: 2

Explanation:
1

2


---

## ✅ Constraints

- The number of nodes in the tree is in the range `[0, 10⁴]`
- `-100 <= Node.val <= 100`