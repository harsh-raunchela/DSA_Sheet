# 73. Set Matrix Zeroes

> Medium | Arrays | Matrix | In-place

---

## 📝 Problem Description

You are given an `m x n` integer matrix.

**Task:**  
If an element is **0**, set its entire **row** and **column** to **0's**.  
You must **do it in-place** (no extra big matrix allowed 🚫).

---

## 📈 Examples

### Example 1:

Input: matrix = [[1,1,1], [1,0,1], [1,1,1]]

After Operation: matrix = [[1,0,1], [0,0,0], [1,0,1]]

Output: [[1,0,1],[0,0,0],[1,0,1]]


---

### Example 2:

Input: matrix = [[0,1,2,0], [3,4,5,2], [1,3,1,5]]

After Operation: matrix = [[0,0,0,0], [0,4,5,0], [0,3,1,0]]

Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]