# 🧹 1898. Maximum Number of Removable Characters

**Difficulty:** Medium  
**Topic(s):** Binary Search, Strings, Greedy

---

## 📝 Problem Statement

You are given:
- Two strings:
    - `s` (the main string)
    - `p` (a subsequence of `s`)
- A list `removable` of distinct 0-indexed integers representing positions in `s`.

You need to **find the maximum value `k` (0 ≤ k ≤ removable.length)** such that after removing the first `k` characters from `s` at positions given by `removable`, **`p` is still a subsequence** of the modified string.

---

## 📥 Input

- `s`, `p` — strings of lowercase English letters
- `removable` — list of distinct indices from `s`

---

## 📤 Output

- Maximum number of characters you can remove from `s` (starting from the beginning of `removable`) while keeping `p` a subsequence.

---

## ✅ Examples

### Example 1

**Input:**  
`s = "abcacb"`  
`p = "ab"`  
`removable = [3,1,0]`

**Output:**  
`2`

**Explanation:**
- After removing indices 3 and 1 → `"abcacb"` becomes `"accb"`
- `"ab"` is still a subsequence.
- But removing index 0 also → `"ccb"` no longer contains `"ab"` as a subsequence.

---

### Example 2

**Input:**  
`s = "abcbddddd"`  
`p = "abcd"`  
`removable = [3,2,1,4,5,6]`

**Output:**  
`1`

---

### Example 3

**Input:**  
`s = "abcab"`  
`p = "abc"`  
`removable = [0,1,2,3,4]`

**Output:**  
`0`

---