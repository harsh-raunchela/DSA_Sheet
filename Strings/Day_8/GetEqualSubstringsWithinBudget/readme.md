# 💸 1208. Get Equal Substrings Within Budget

**Difficulty:** Medium  
**Topics:** Sliding Window, String, Two Pointers

---

## 📝 Problem Statement

You're given two strings `s` and `t` of **equal length**, and an integer `maxCost`.  
Each character change from `s[i]` to `t[i]` costs `|ord(s[i]) - ord(t[i])|`.

Return the **maximum length** of a substring in `s` that can be transformed into the corresponding substring in `t` **without exceeding `maxCost`**.

---

## 📥 Input

- Two strings `s` and `t` of equal length: `1 <= s.length <= 10⁵`
- An integer `maxCost` where `0 <= maxCost <= 10⁶`
- Both strings consist only of lowercase English letters.

---

## 📤 Output

- The maximum length of a valid transformable substring within the budget.

---

## ✅ Examples

### Example 1

**Input:**  
`s = "abcd"`, `t = "bcdf"`, `maxCost = 3`  
**Output:** `3`  
**Explanation:**  
Change `"abc"` → `"bcd"` costs 1 + 1 + 1 = 3

---

### Example 2

**Input:**  
`s = "abcd"`, `t = "cdef"`, `maxCost = 3`  
**Output:** `1`  
**Explanation:**  
Each change costs 2, so only one character can be changed within budget.

---

### Example 3

**Input:**  
`s = "abcd"`, `t = "acde"`, `maxCost = 0`  
**Output:** `1`  
**Explanation:**  
Only matching characters can be retained, can't afford any transformation.

---