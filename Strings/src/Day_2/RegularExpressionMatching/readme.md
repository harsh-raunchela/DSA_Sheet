# 🧪 LeetCode 10 - Regular Expression Matching

## 🧩 Problem Statement

Given an input string `s` and a pattern `p`, implement regular expression matching with support for:

- `'.'` → Matches **any single character**
- `'*'` → Matches **zero or more of the preceding element**

The match must **cover the entire input string**.

---

## 🧠 Examples

### Example 1
**Input:**  
`s = "aa"`  
`p = "a"`  
**Output:**  
`false`  
**Explanation:** Pattern `"a"` doesn't match the entire string `"aa"`.

---

### Example 2
**Input:**  
`s = "aa"`  
`p = "a*"`  
**Output:**  
`true`  
**Explanation:** `"a*"` can match multiple `'a'` characters, so it matches `"aa"`.

---

### Example 3
**Input:**  
`s = "ab"`  
`p = ".*"`  
**Output:**  
`true`  
**Explanation:** `"."` matches any character, `*` allows repeating — so `"ab"` is matched.

---

## ✅ Constraints

- `1 <= s.length <= 20`
- `1 <= p.length <= 30`
- `s` contains only lowercase English letters
- `p` contains only lowercase English letters, `'.'`, and `'*'`
- `'*'` will always follow a valid character

---

## 🚀 Approach

We use **Dynamic Programming** or **Recursion + Memoization** to solve
A network error occurred. Please check your connection and try again. If this issue persists please contact us through our help center at help.openai.com.


Retry






