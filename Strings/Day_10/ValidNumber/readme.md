# 🔍 65. Valid Number

**Difficulty:** Hard  
**Topics:** String, Parsing, Automata, Regex

---

## 📝 Problem Statement

Determine if a given string `s` is a **valid number**.

---

## ✅ Valid Examples

"2", "0089", "-0.1", "+3.14", "4.", "-.9",
"2e10", "-90E3", "3e+7", "+6e-1",
"53.5e93", "-123.456e789"


## ❌ Invalid Examples

"abc", "1a", "1e", "e3", "99e2.5",
"--6", "-+3", "95a54e53", ".", "e"


---

## 📐 Valid Number Format

A **valid number** can be:
1. An **integer** → `"123"`, `"-456"`
2. A **decimal** → `"1.0"`, `".9"`, `"4."`
3. A **number + exponent** → `"2e10"`, `"3.14e-5"`

### 🧩 Components:
- **Sign**: Optional `+` or `-`
- **Digits**: At least one digit
- **Dot**: Only for decimals
- **Exponent**: `e` or `E` followed by an integer (with optional sign)

---

## 💡 Approach

### ✅ Rules to follow:
- Only **one `e` or `E`** allowed.
- Exponent must be followed by a **valid integer**.
- Only **one dot `.`** allowed and **must be placed properly**.
- Characters must be in the **correct order**.
- A valid decimal must have at least one digit (before or after dot).

---
