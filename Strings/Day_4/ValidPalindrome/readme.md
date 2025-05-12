# 🔁 LeetCode 125 - Valid Palindrome

## 📝 Problem Statement

A **palindrome** is a string that reads the same backward as forward.

You're given a string `s`. You need to:
- Ignore **case** (uppercase/lowercase doesn't matter)
- Remove all **non-alphanumeric** characters (keep only a–z and 0–9)

Return `true` if the resulting string is a palindrome, else return `false`.

---

## 🧠 Examples

### Example 1
**Input:**
```python
s = "A man, a plan, a canal: Panama"
Output:

True

Why? After cleaning: "amanaplanacanalpanama" is the same forward and backward ✅

Example 2
Input:

s = "race a car"

Output:

False

Why? "raceacar" is not the same backward ❌