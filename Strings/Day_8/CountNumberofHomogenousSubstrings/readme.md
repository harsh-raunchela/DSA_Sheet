# 🔁 1759. Count Number of Homogenous Substrings

**Difficulty:** Medium  
**Topics:** String, Math, Sliding Window

---

## 📝 Problem Statement

Given a string `s`, return the number of **homogenous substrings** of `s`.

A **homogenous substring** is a contiguous substring where **all characters are the same**.  
Since the answer may be too large, return it **modulo** `10⁹ + 7`.

---

## 📥 Input

- A string `s` consisting only of lowercase English letters.
- `1 <= s.length <= 10⁵`

---

## 📤 Output

- The total number of homogenous substrings modulo `10⁹ + 7`.

---

## ✅ Examples

### Example 1

**Input:**  
`s = "abbcccaa"`  
**Output:** `13`

**Explanation:**  
Homogenous substrings are:
"a" → 3 times
"aa" → 1 time
"b" → 2 times
"bb" → 1 time
"c" → 3 times
"cc" → 2 times
"ccc" → 1 time
Total = 3 + 1 + 2 + 1 + 3 + 2 + 1 = 13

---

### Example 2

**Input:**  
`s = "xy"`  
**Output:** `2`  
**Explanation:** Just two homogenous substrings: `"x"` and `"y"`.

---

### Example 3

**Input:**  
`s = "zzzzz"`  
**Output:** `15`  
**Explanation:** All characters are the same, so substrings are:
"z" → 5 times
"zz" → 4 times
"zzz" → 3 times
"zzzz" → 2 times
"zzzzz" → 1 time
Total = 5 + 4 + 3 + 2 + 1 = 15


---
