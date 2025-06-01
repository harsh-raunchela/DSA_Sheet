# 🧠 Valid Parentheses (LeetCode #20)

**Difficulty:** Easy  
**Tags:** 🧩 Stack, 🔁 Strings, 📏 Validation  
**Problem Type:** Data Structures / Algorithms

---

## 📝 Problem Statement

Given a string `s` containing just the characters:

( ) { } [ ]


Check if the string is **valid**. A valid string means:

- Every open bracket has a matching **closing bracket**.
- Brackets must close in the **correct order**.
- Bracket types must **match exactly** — e.g., `(` must close with `)`.

---

## 💡 Examples

### ✅ Valid Cases

```plaintext
Input: s = "()"
Output: true

Input: s = "()[]{}"
Output: true

Input: s = "([])"
Output: true


❌ Invalid Cases
Input: s = "(]"
Output: false

Input: s = "([)]"
Output: false