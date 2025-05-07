# 🔍 LeetCode 1662 - Check If Two String Arrays are Equivalent

## 🧩 Problem Statement

You're given two arrays of strings, `word1` and `word2`.

Your task is to determine whether these arrays represent the **same string** when their elements are concatenated in order.

---

## 🧠 Examples

### Example 1
**Input:**  
`word1 = ["ab", "c"], word2 = ["a", "bc"]`  
**Output:**  
`true`  
**Explanation:**
- word1 → "ab" + "c" = `"abc"`
- word2 → "a" + "bc" = `"abc"`

Both form the same string.

---

### Example 2
**Input:**  
`word1 = ["a", "cb"], word2 = ["ab", "c"]`  
**Output:**  
`false`  
**Explanation:**
- word1 → `"acb"`
- word2 → `"abc"`  
  Strings do not match.

---

### Example 3
**Input:**  
`word1 = ["abc", "d", "defg"], word2 = ["abcddefg"]`  
**Output:**  
`true`

---

## ✅ Constraints

- `1 <= word1.length, word2.length <= 10^3`
- `1 <= word1[i].length, word2[i].length <= 10^3`
- All strings consist of lowercase English letters

---