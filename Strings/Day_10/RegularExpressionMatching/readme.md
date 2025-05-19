# 🎭 10. Regular Expression Matching

**Difficulty:** Hard  
**Topics:** Dynamic Programming, String, Recursion

---

## 📝 Problem Statement

Implement a regex matcher for input string `s` and pattern `p` with support for:
- `'.'` → Matches **any single character**
- `'*'` → Matches **zero or more** of the **preceding element**

⚠️ The match must cover the **entire string** (not just part of it).

---

## 📥 Examples

### Example 1:
Input: s = "aa", p = "a"
Output: false
Explanation: 'a' doesn't match the full string "aa"


### Example 2:
Input: s = "aa", p = "a*"
Output: true
Explanation: '*' allows "a" to repeat → matches "aa"



### Example 3:
Input: s = "ab", p = "."
Output: true
Explanation: '.' = any char, '' = repeat any → matches everything

yaml
Copy
Edit

---
