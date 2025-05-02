# 🔄 566. Reshape the Matrix

**Difficulty:** Easy  
**Category:** Array / Matrix  
**Link:** [LeetCode - Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)

---

## 📝 Problem Statement

In MATLAB, there's a function called `reshape` that lets you change the shape of a matrix without altering the order of elements.

You're given:
- A matrix `mat` of size `m x n`
- Two integers `r` and `c` — desired number of rows and columns

Return the reshaped matrix if it’s valid (i.e., total number of elements stays the same). Otherwise, return the original matrix.

---

## 🧠 Examples

### Example 1:
Input: mat = [[1,2],[3,4]], r = 1, c = 4

Output: [[1,2,3,4]]


### Example 2:
Input: mat = [[1,2],[3,4]], r = 2, c = 4

Output: [[1,2],[3,4]]

