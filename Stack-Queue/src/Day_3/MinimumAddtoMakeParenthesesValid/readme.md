# 🔧 LeetCode 921: Minimum Add to Make Parentheses Valid

> 🟠 Medium | 💻 Stack / Greedy | 🧠 String | ✅ Solved

---

## 🧩 Problem Statement

A parentheses string is **valid** if and only if:

1. It is the empty string `""`.
2. It can be written as `AB`, where `A` and `B` are valid strings.
3. It can be written as `(A)`, where `A` is a valid string.

You're given a string `s` containing only `'('` and `')'`.

🛠 **In one move**, you can insert a parenthesis at any position in the string.

👉 Your task is to return the **minimum number of insertions** needed to make `s` valid.

---

## ✨ Examples

### Example 1:
Input: s = "())"
Output: 1
Explanation: Add one '(' at the beginning → "(()))"


### Example 2:
Input: s = "((("
Output: 3
Explanation: Add three ')' to balance → "((()))"