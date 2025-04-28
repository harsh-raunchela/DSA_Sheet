# 1572. Matrix Diagonal Sum

> Easy | Arrays | Matrix

---

## 📝 Problem Description

You are given a **square matrix** `mat`.

**Task:**  
Return the **sum of both diagonals**:
- **Primary diagonal:** Top-left ➡️ Bottom-right
- **Secondary diagonal:** Top-right ➡️ Bottom-left
- **Important:** If an element is shared by both diagonals (center of matrix), count it **only once**.

---

## 📈 Examples

### Example 1:

Input: mat = [[1,2,3], [4,5,6], [7,8,9]]

Primary diagonal: 1 ➡️ 5 ➡️ 9 Secondary diagonal: 3 ➡️ 5 ➡️ 7

Sum = 1 + 5 + 9 + 3 + 7 = 25 (Note: 5 is counted only once.) Output: 25



---

### Example 2:

Input: mat = [[1,1,1,1], [1,1,1,1], [1,1,1,1], [1,1,1,1]]

Sum = 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 = 8 Output: 8


---

### Example 3:

Input: mat = [[5]]

Sum = 5 Output: 5