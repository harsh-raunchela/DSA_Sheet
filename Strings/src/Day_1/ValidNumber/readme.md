# 🔢 LeetCode - Valid Number

## 🧩 Problem Statement

Given a string `s`, return `true` if it represents a **valid number**, else return `false`.

A **valid number** can be:
- A decimal number (e.g., `"3.14"`, `".9"`)
- An integer (e.g., `"2"`, `"-123"`)
- A number in **exponential notation** (e.g., `"2e10"`, `"53.5e93"`)

### 📝 Rules for a Valid Number

- **Integer**: Optional sign (`+` or `-`) followed by digits.
- **Decimal**:
    - Digits followed by a dot (`.`)
    - Digits + dot + digits
    - Dot + digits
    - Optional sign at the start
- **Exponent**: `'e'` or `'E'` followed by a **valid integer**
- A number can be a decimal or integer followed by an exponent

---

## ✅ Valid Examples

---

## 🔍 Examples

### Example 1
**Input:** `s = "0"`  
**Output:** `true`

### Example 2
**Input:** `s = "e"`  
**Output:** `false`

### Example 3
**Input:** `s = "."`  
**Output:** `false`

---

## 💡 Constraints
- `1 <= s.length <= 20`
- `s` contains only printable ASCII characters

---