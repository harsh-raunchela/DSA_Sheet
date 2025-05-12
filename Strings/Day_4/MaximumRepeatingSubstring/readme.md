# 🔁 LeetCode 1668 - Maximum Repeating Substring

## 📝 Problem Statement

A string `word` is said to be **k-repeating** in a string `sequence` if `word` repeated `k` times (`word * k`) is a substring of `sequence`.

Return the **maximum** value of `k` such that `word * k` is still a substring of `sequence`.

---

## 💡 Examples

### Example 1
**Input:**
```python
sequence = "ababc"
word = "ab"

Output: 2

Explanation: "abab" is a substring of "ababc".

Example 2

Input:

sequence = "ababc"

word = "ba"

Output: 1

Explanation: "ba" is a substring, but "baba" is not.

