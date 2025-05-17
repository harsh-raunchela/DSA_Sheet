# 🕒 539. Minimum Time Difference

**Difficulty:** Medium  
**Topics:** Array, String, Sorting

---

## 📝 Problem Statement

You’re given a list of `timePoints`, each in **"HH:MM"** 24-hour format.  
Your task is to **find the minimum difference (in minutes)** between any two time points in the list.

---

## 📥 Input

- A list of strings `timePoints` where each element is a time in `"HH:MM"` format.
- `2 <= timePoints.length <= 2 * 10^4`

---

## 📤 Output

- Return the **minimum minutes difference** between any two time-points.

---

## ✅ Examples

### Example 1

**Input:**  
`["23:59", "00:00"]`  
**Output:**  
`1`  
**Explanation:**  
These two times are 1 minute apart over midnight.

---

### Example 2

**Input:**  
`["00:00", "23:59", "00:00"]`  
**Output:**  
`0`  
**Explanation:**  
Duplicate times → zero difference.

---
