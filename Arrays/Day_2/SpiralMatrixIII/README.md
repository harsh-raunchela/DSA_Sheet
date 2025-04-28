# 885. Spiral Matrix III

> Medium | Matrix | Simulation | Coordinates

---

## 📝 Problem Description

You are given a **rows × cols** grid.  
You start walking at position **(rStart, cStart)** facing **East** ➡️.

You must walk in a **clockwise spiral**, visiting **every cell exactly once**.  
If you go outside the grid boundary — **no problem!** — just keep walking and re-enter later.

---

## 📈 Examples

### Example 1:

Input: rows = 1, cols = 4, rStart = 0, cStart = 0

Output: [[0,0],[0,1],[0,2],[0,3]]

✅ You just move right (East) across the single row.

---

### Example 2:

Input: rows = 5, cols = 6, rStart = 1, cStart = 4

Output: [[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5], [3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2], [4,5],[4,4],[4,3],[4,2],[4,1], [3,1],[2,1],[1,1],[0,1], [4,0],[3,0],[2,0],[1,0],[0,0]]
