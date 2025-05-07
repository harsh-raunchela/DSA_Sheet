# 🔄 LeetCode 686 - Repeated String Match

## 🧩 Problem Statement

Given two strings `a` and `b`, return the minimum number of times you should repeat string `a` so that string `b` becomes a **substring** of the repeated version of `a`. If it is impossible for `b` to be a substring of any repeated version of `a`, return `-1`.

**Important Notes:**
- Repeating string "abc" 0 times results in an empty string.
- Repeating string "abc" 1 time results in "abc".
- Repeating string "abc" 2 times results in "abcabc".

---

## 🧠 Examples

### Example 1
**Input:**  
`a = "abcd"`  
`b = "cdabcdab"`  
**Output:**  
`3`  
**Explanation:**  
We return 3 because by repeating `"abcd"` three times, we get `"abcdabcdabcd"`, and `"cdabcdab"` becomes a substring of it.

---

### Example 2
**Input:**  
`a = "a"`  
`b = "aa"`  
**Output:**  
`2`  
**Explanation:**  
Repeating `"a"` two times gives `"aa"`, which matches string `b`.

---

### Example 3
**Input:**  
`a = "abc"`  
`b = "wxyz"`  
**Output:**  
`-1`  
**Explanation:**  
No matter how many times you repeat `"abc"`, `"wxyz"` will never be a substring of it.

---

## ✅ Constraints

- `1 <= a.length, b.length <= 10^4`
- Both `a` and `b` consist of **lowercase** English letters.

---
