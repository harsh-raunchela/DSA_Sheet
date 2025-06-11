# 701. Insert into a Binary Search Tree 🟦

## 🧠 Problem Statement

You're given the root node of a **Binary Search Tree (BST)** and an integer `val` to insert into the tree. Return the **root node of the BST after the insertion**.  
It is guaranteed that the new value does not exist in the original BST.

There may be **multiple valid ways** to insert the value as long as the resulting structure remains a BST. You can return **any** valid tree.

---

## 💡 Example

### Example 1:
Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]


### Example 2:
Input: root = [40,20,60,10,30,50,70], val = 25
Output: [40,20,60,10,30,50,70,null,null,25]



### Example 3:
Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
Output: [4,2,7,1,3,5]