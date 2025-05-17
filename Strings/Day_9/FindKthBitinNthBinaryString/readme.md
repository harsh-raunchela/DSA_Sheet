# 🧬 1545. Find Kth Bit in Nth Binary String

**Difficulty:** Medium  
**Topics:** Recursion, Strings, Bit Manipulation

---

## 📝 Problem Statement

You are given two positive integers `n` and `k`. A sequence of binary strings `S1, S2, ..., Sn` is defined as:

- `S1 = "0"`
- `Si = Si-1 + "1" + reverse(invert(Si-1))` for `i > 1`

Where:
- `+` means string concatenation
- `invert(x)` flips every bit: `'0' → '1'`, `'1' → '0'`
- `reverse(x)` flips the string order

Return the **k-th bit** (1-indexed) in string `Sn`.

⚠️ Directly building the string for large `n` is inefficient — use a recursive approach!

---

## ✅ Examples

### Example 1

**Input:**  
`n = 3, k = 1`  
**Output:** `"0"`  
**Explanation:**  
S3 = `"0111001"`, and the 1st bit is `"0"`

---

### Example 2

**Input:**  
`n = 4, k = 11`  
**Output:** `"1"`  
**Explanation:**  
S4 = `"011100110110001"`, and the 11th bit is `"1"`

---