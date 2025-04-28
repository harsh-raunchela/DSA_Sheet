# 1252. Cells with Odd Values in a Matrix

> Easy | Arrays | Matrix

---

## 📝 Problem Description

You are given:
- An `m x n` matrix initialized to all 0's.
- A list `indices`, where each `indices[i] = [ri, ci]` represents a **0-indexed** location.

**For each (ri, ci) in indices:**
- Increment all the cells in row `ri`.
- Increment all the cells in column `ci`.

**Goal:**  
Return the number of cells with **odd values** in the matrix after performing all operations.

---

## 📈 Examples

### Example 1:

Input: m = 2, n = 3, indices = [[0,1],[1,1]]

Initial matrix: [[0, 0, 0], [0, 0, 0]]

After (0,1) increment: [[1, 2, 1], [0, 1, 0]]

After (1,1) increment: [[1, 3, 1], [1, 3, 1]]

Odd numbers = 6 Output: 6



---

### Example 2:

Input: m = 2, n = 2, indices = [[1,1],[0,0]]

Final matrix: [[2, 2], [2, 2]]

