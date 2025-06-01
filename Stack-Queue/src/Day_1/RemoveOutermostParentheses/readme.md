# 🧩 Leetcode 1021 — Remove Outermost Parentheses

## 📄 Problem Description

A **valid parentheses string** is one of the following:
- An empty string: `""`
- `"(" + A + ")"`, where `A` is a valid parentheses string
- `A + B`, where both `A` and `B` are valid parentheses strings

Some examples:
- Valid: `"()"`, `"(())()"`, `"(()(()))"`
- Invalid: `"(()"`, `")("`, `"())("`

---

A **primitive** valid parentheses string is a nonempty valid string that **cannot** be split into two nonempty valid strings.

**Goal:**  
Given a valid parentheses string `s`, decompose it into **primitive parts** and **remove the outermost parentheses** of each part.

---

## ✍️ Input

```text
A string `s` consisting of only `'('` and `')'`, and is a valid parentheses string.
🏁 Output

Return the string after removing the outermost parentheses of each primitive part.
🧠 Examples
Example 1:

Input:  s = "(()())(())"
Output: "()()()"
Explanation:
Primitive decomposition:

"(()())" → remove outer → "()()"

"(())" → remove outer → "()"
Result: "()()" + "()" = ()()()"

Example 2:

Input:  s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation:
Primitive decomposition:

"(()())" → "()()"

"(())" → "()"

"(()(()))" → "()(())"
Result: "()()" + "()" + "()(())" = ()()()()(())

Example 3:

Input:  s = "()()"
Output: ""
Explanation:
Each "()" is primitive, and after removing outermost parentheses from each → "" + "" = ""