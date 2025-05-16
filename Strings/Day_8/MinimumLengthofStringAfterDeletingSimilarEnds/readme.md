# ✂️ 1750. Minimum Length of String After Deleting Similar Ends

**Difficulty:** Medium  
**Topics:** Two Pointers, String

---

## 📝 Problem Statement

You are given a string `s` consisting only of characters `'a'`, `'b'`, and `'c'`.  
You can repeatedly perform the following operation:

1. Pick a non-empty **prefix** of `s` where all characters are the same.
2. Pick a non-empty **suffix** of `s` where all characters are the same.
3. The **prefix and suffix must be the same character** and **must not overlap**.
4. Delete both the prefix and the suffix.

Return the **minimum possible length** of `s` after performing this operation any number of times (possibly zero).

---

## 📥 Input

- `s`: a string consisting only of `'a'`, `'b'`, and `'c'`
- `1 <= s.length <= 10⁵`

---

## 📤 Output

- The minimum length of the string after applying the operations

---

## ✅ Examples

### Example 1

**Input:** `s = "ca"`  
**Output:** `2`  
**Explanation:** No operation can be applied.

---

### Example 2

**Input:** `s = "cabaabac"`  
**Output:** `0`  
**Explanation:**
"cabaabac" → remove "c" and "c" → "abaaba"
→ remove "a" and "a" → "baab"
→ remove "b" and "b" → "aa"
→ remove "a" and "a" → ""

---

### Example 3

**Input:** `s = "aabccabba"`  
**Output:** `3`  
**Explanation:** Optimal operations leave `"cca"`

---
