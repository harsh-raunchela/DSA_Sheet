# 🔀 LeetCode 1528 - Shuffle String

## 🧩 Problem Statement

You are given a string `s` and an integer array `indices` of the **same length**.  
The goal is to **shuffle** the string so that the character at the *i-th* position moves to `indices[i]` in the new string.

Return the **shuffled string**.

---

## 🧠 Examples

### Example 1
**Input:**  
`s = "codeleet"`  
`indices = [4,5,6,7,0,2,1,3]`  
**Output:**  
`"leetcode"`  
**Explanation:**  
The character at index 0 ('c') goes to position 4, index 1 ('o') → 5, and so on. The final string is `"leetcode"`.

---

### Example 2
**Input:**  
`s = "abc"`  
`indices = [0,1,2]`  
**Output:**  
`"abc"`  
**Explanation:**  
Each character remains in its original position.

---

## ✅ Constraints

- `s.length == indices.length == n`
- `1 <= n <= 100`
- `s` consists only of **lowercase English letters**
- All values in `indices` are **unique**
- `0 <= indices[i] < n`

---