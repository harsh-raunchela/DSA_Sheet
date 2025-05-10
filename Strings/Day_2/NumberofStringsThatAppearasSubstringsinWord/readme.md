# 🔍 LeetCode 1967 - Number of Strings That Appear as Substrings in Word

## 📝 Problem Statement

You're given an array of strings `patterns` and a single string `word`. Return the count of strings in `patterns` that appear as substrings in `word`.

> A **substring** is a contiguous block of characters from a string.

---

## 📥 Input

- `patterns`: A list of strings.
- `word`: A single string.

## 📤 Output

- An integer count of how many patterns are substrings of `word`.

---

## 🧠 Examples

### Example 1

**Input:**
```python
patterns = ["a", "abc", "bc", "d"]

word = "abc"

Output:

3
Explanation:

"a", "abc", and "bc" are substrings of "abc". "d" is not.

Example 2

Input:

patterns = ["a", "b", "c"]

word = "aaaaabbbbb"


Output:
2


Explanation:

"a" and "b" are substrings, "c" is not.

