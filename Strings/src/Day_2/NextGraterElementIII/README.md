# 🔢 LeetCode 556 - Next Greater Element III

## 🧩 Problem Statement

Given a **positive integer** `n`, find the **smallest integer** which:
- Has exactly the same digits as `n`, and
- Is **greater** in value than `n`.

If **no such number** exists, return `-1`.

> 📌 Note: The result must fit within a **32-bit signed integer**. If a valid number exists but **overflows**, return `-1`.

---

## 🧠 Examples

### Example 1
**Input:**  
`n = 12`  
**Output:**  
`21`  
**Explanation:**  
21 is the next greater number using the digits of 12.

---

### Example 2
**Input:**  
`n = 21`  
**Output:**  
`-1`  
**Explanation:**  
There is no greater number using the digits of 21.

---

## ✅ Constraints

- `1 <= n <= 2^31 - 1` (i.e., within 32-bit signed integer range)

---