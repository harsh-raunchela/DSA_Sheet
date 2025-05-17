# 🐫 1023. Camelcase Matching

**Difficulty:** Medium  
**Topics:** Two Pointers, String Matching

---

## 📝 Problem Statement

You are given:
- An array of strings `queries`
- A string `pattern`

You must return a boolean array `answer` where `answer[i]` is `true` if `queries[i]` **matches** the pattern, and `false` otherwise.

💡 **Matching Rule:**  
A query matches the pattern if you can insert **only lowercase letters** into the pattern (at any position) to form the query.

> ⚠️ You cannot remove or reorder characters in the pattern.

---

## ✅ Examples

### Example 1

**Input:**
```text
queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"]
pattern = "FB"
Output:

[true, false, true, true, false]
Explanation:

✅ FooBar → "F" + "oo" + "B" + "ar"

❌ FooBarTest → has extra uppercase "T"

✅ FootBall → "F" + "oot" + "B" + "all"

✅ FrameBuffer → "F" + "rame" + "B" + "uffer"

❌ ForceFeedBack → extra uppercase 