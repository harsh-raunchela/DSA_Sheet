# 🔁 777. Swap Adjacent in LR String

**Difficulty:** Medium  
**Topics:** Two Pointers, Greedy, Simulation

---

## 📝 Problem Statement

You are given two strings `start` and `end` of equal length, made up of the characters `'L'`, `'R'`, and `'X'`.

You can perform the following operations any number of times:

- Replace one occurrence of `"XL"` with `"LX"`
- Replace one occurrence of `"RX"` with `"XR"`

**Your goal** is to determine whether it is possible to transform the `start` string into the `end` string using a sequence of these operations.

---

## 📥 Input

- `start`, `end` – Strings of the same length (1 ≤ length ≤ 10⁴)
- Only contains characters `'L'`, `'R'`, and `'X'`

---

## 📤 Output

- Return `true` if `start` can be transformed into `end`, otherwise return `false`.

---

## ✅ Examples

### Example 1

**Input:**  
`start = "RXXLRXRXL"`  
`end = "XRLXXRRLX"`

**Output:**  
`true`

**Explanation:**  
We can perform the following moves:
RXXLRXRXL
→ XRXLRXRXL
→ XRLXRXRXL
→ XRLXXRRXL
→ XRLXXRRLX


---

### Example 2

**Input:**  
`start = "X"`  
`end = "L"`

**Output:**  
`false`

---

## 🤔 Observations

- `'L'` can only move **to the left** (`XL → LX`)
- `'R'` can only move **to the right** (`RX → XR`)
- `'L'` cannot move past an `'R'`, and vice versa.

---