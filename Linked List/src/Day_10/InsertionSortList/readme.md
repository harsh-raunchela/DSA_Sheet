# 🧠 LeetCode 147: Insertion Sort List

## 📘 Problem Statement

Given the `head` of a **singly linked list**, sort the list using **insertion sort**, and return the **sorted list's head**.

### 🧮 Insertion Sort Algorithm Overview:

- Insertion Sort iterates over the list, consuming one node at a time.
- It builds a new **sorted portion** of the list by placing each new node in its correct position.
- At each iteration, one element is removed from the input data, placed correctly in the sorted list.
- This process continues until all nodes are sorted.

---

## 🖼️ Visual Representation

Start: [4] [2] [1] [3]

Iteration 1: [2, 4] [1] [3]
Iteration 2: [1, 2, 4] [3]
Iteration 3: [1, 2, 3, 4]

---

## 🧪 Examples

### Example 1:
```text
Input:  head = [4, 2, 1, 3]

Output: [1, 2, 3, 4]



Input:  head = [-1, 5, 3, 4, 0]

Output: [-1, 0, 3, 4, 5]