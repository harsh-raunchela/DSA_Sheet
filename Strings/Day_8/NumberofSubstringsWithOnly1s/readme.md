# 🔢 1513. Number of Substrings With Only 1s

**Difficulty:** Medium  
**Topics:** Math, String, Sliding Window

---

## 📝 Problem Statement

Given a **binary string** `s`, return the number of substrings that consist **only of characters `'1'`**.

Since the number of such substrings can be large, return the result **modulo** `10⁹ + 7`.

---

## 📥 Input

- `s`: a binary string (`'0'` or `'1'`)
- `1 <= s.length <= 10⁵`

---

## 📤 Output

- The count of substrings made only of `'1'`s, modulo `10⁹ + 7`.

---

## ✅ Examples

### Example 1

**Input:**  
`s = "0110111"`  
**Output:** `9`  
**Explanation:**  
Substrings with only `'1'`:
"1" → appears 5 times
"11" → appears 3 times
"111" → appears 1 time
Total = 5 + 3 + 1 = 9

---

### Example 2

**Input:**  
`s = "101"`  
**Output:** `2`  
**Explanation:**  
Only two single `'1'` substrings.

---

### Example 3

**Input:**  
`s = "111111"`  
**Output:** `21`  
**Explanation:**  
Total substrings of size 1 to 6:
6 + 5 + 4 + 3 + 2 + 1 = 21


---