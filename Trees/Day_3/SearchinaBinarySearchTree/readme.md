# Leetcode 700 - Search in a Binary Search Tree 🧠🌲

## 📝 Problem Statement

You are given the `root` of a **binary search tree (BST)** and an integer `val`.

Your task is to **find the node** in the BST such that the node's value equals `val`, and return the **subtree rooted with that node**. If such a node does not exist, return `null`.

---

## 📥 Input

- `root`: The root node of the BST
- `val`: Integer value to search for

---

## 📤 Output

- Return the **subtree rooted** at the node with value `val`
- If `val` is **not found**, return `null`

---

## 🔍 Example 1

Input: root = [4,2,7,1,3], val = 2


4
/ \
2   7
/ \
1   3
Output: [2,1,3]



---

## ❌ Example 2

Input: root = [4,2,7,1,3], val = 5


4
/ \
2   7
/ \
1   3