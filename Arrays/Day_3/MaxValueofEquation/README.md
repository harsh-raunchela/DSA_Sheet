# 🔥 1499. Max Value of Equation

**Difficulty:** Hard  
**Topics:** Arrays, Heap, Sliding Window, Deque

---

## 🧠 Problem Statement

You're given a list of 2D points sorted by `x` values:  
Each `points[i] = [xi, yi]` where `xi < xj` for all `i < j`.

Also given: an integer `k`.

Return the **maximum** value of the equation:


The absolute difference ensures we always take the positive difference between the x-values.

---

## 🧪 Examples

### Example 1:

Input: points = [[1,3],[2,0],[5,10],[6,-10]], k = 1 Output: 4

Explanation:

(1,3) and (2,0) → 3 + 0 + |1 - 2| = 4

(5,10) and (6,-10) → 10 - 10 + |5 - 6| = 1 Max = 4


### Example 2:

Input: points = [[0,0],[3,0],[9,2]], k = 3 Output: 3

Explanation:

(0,0) and (3,0) → 0 + 0 + |0 - 3| = 3

