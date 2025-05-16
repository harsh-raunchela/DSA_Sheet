# 🔁 848. Shifting Letters

**Difficulty:** Medium  
**Topics:** String, Prefix Sum, Array Manipulation

---

## 📝 Problem Statement

You're given a lowercase string `s` and an integer array `shifts`, both of the same length.

Each `shifts[i]` represents how many times you need to shift the **first `i + 1` characters** of the string to the right in the alphabet.

A **shift** means moving a character to the next one, wrapping around if needed:
- `'a' -> 'b'`, `'z' -> 'a'`

---

## 📥 Input

- A string `s` of lowercase English letters
- An array `shifts` with the same length as `s`

---

## 📤 Output

- Return the final string after applying all the shifts.

---

## ✅ Examples

### Example 1

**Input:**  
`s = "abc"`, `shifts = [3,5,9]`  
**Output:** `"rpl"`

**Explanation:**
- Shift first 1 character by 3 → `"dbc"`
- Shift first 2 characters by 5 → `"igc"`
- Shift first 3 characters by 9 → `"rpl"`

---

### Example 2

**Input:**  
`s = "aaa"`, `shifts = [1,2,3]`  
**Output:** `"gfd"`

---