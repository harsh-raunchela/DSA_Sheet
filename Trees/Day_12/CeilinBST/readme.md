# 📈 Ceil in Binary Search Tree (BST)

**Difficulty:** Medium  
**Accuracy:** 62.73%  
**Submissions:** 145K+  
**Points:** 4  
**Average Time to Solve:** 30 minutes

---

## 🧠 Problem Statement

Given a **Binary Search Tree (BST)** and a number **X**, your task is to find the **Ceil of X** in the BST.

**Definition:**  
**Ceil(X)** is the **smallest element in the BST that is greater than or equal to X**.

If such a number **doesn’t exist**, return `-1`.

---

## 🧾 Constraints

- `1 <= Number of nodes <= 10^5`
- `1 <= Value of nodes <= 10^5`

---

## 🧪 Examples

### Example 1
**Input:**
BST: [5, 1, 7, N, 2, N, N, N, 3]
X = 3

**Output:** `3`  
**Explanation:**  
We find 3 in BST, so ceil of 3 is 3.

---

### Example 2
**Input:**
BST: [10, 5, 11, 4, 7, N, N, N, N, N, 8]
X = 6

**Output:** `7`  
**Explanation:**  
We don't find 6, but the next greater value is 7.

---