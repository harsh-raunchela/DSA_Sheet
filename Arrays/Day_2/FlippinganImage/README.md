# 832. Flipping an Image

> Easy | Array | Matrix

---

## 📝 Problem Description

You are given an `n x n` binary matrix `image`.  
First, flip the image **horizontally**, then **invert** it, and finally return the resulting image.

- **Flip Horizontally** → Reverse each row.
    - Example: `[1,1,0]` → `[0,1,1]`
- **Invert** → Replace every `0` with `1` and every `1` with `0`.
    - Example: `[0,1,1]` → `[1,0,0]`

---

## 📈 Examples

### Example 1:
Input: image = [[1,1,0], [1,0,1], [0,0,0]]

Step 1 (Flip horizontally): [[0,1,1], [1,0,1], [0,0,0]]

Step 2 (Invert): [[1,0,0], [0,1,0], [1,1,1]]

Output: [[1,0,0],[0,1,0],[1,1,1]]


### Example 2:
Input: image = [[1,1,0,0], [1,0,0,1], [0,1,1,1], [1,0,1,0]]

Step 1 (Flip horizontally): [[0,0,1,1], [1,0,0,1], [1,1,1,0], [0,1,0,1]]

Step 2 (Invert): [[1,1,0,0], [0,1,1,0], [0,0,0,1], [1,0,1,0]]

Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]


---

## 💡 Hints
- Try doing both operations at the same time to optimize!
- Flipping + inverting can happen in a single traversal of the matrix.

---

## 🔗 Problem Link
[**LeetCode - 832. Flipping an Image**](https://leetcode.com/problems/flipping-an-image/)

---
