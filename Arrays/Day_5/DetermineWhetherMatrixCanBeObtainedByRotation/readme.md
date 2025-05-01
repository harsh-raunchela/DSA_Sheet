# 🔄 1886. Determine Whether Matrix Can Be Obtained By Rotation

**Difficulty:** Easy  
**Link:** [LeetCode - Determine Whether Matrix Can Be Obtained By Rotation](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)

---

## 🧠 Problem Summary

You're given two **n x n binary matrices**:
- `mat`: the original matrix
- `target`: the desired matrix

Your task is to determine whether `mat` can be rotated **90 degrees clockwise (up to 3 times)** to become `target`.

---

## 📥 Input

- `mat`: List of Lists (binary matrix)
- `target`: List of Lists (binary matrix)

---

## 📤 Output

- `true` if `mat` can become `target` through rotation
- `false` otherwise

---

## 🧩 Examples

### Example 1
```text
Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true


Example 2

Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false


Example 3

Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
