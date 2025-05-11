# 🔍 LeetCode 28 - Find the Index of the First Occurrence in a String

## 📝 Problem Statement

Given two strings `haystack` and `needle`, return the **index of the first occurrence** of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

---

## 📥 Input

- `haystack` (1 ≤ length ≤ 10⁴): the full string to search in.
- `needle` (1 ≤ length ≤ 10⁴): the substring to search for.

## 📤 Output

- Integer: the index of the first match, or `-1` if not found.

---

## 🧠 Examples

### Example 1

**Input:**
```python
haystack = "sadbutsad"
needle = "sad"

OUTPUT: 

0


Explanation: The substring "sad" appears at index 0 and 6. The first one is returned.

Example 2

Input:

haystack = "leetcode"
needle = "leeto"


OUTPUT:

-1


Explanation: "leeto" is not a substring of "leetcode".