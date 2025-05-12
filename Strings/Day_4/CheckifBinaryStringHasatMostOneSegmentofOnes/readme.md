# ✅ LeetCode 1784 - Check if Binary String Has at Most One Segment of Ones

## 📝 Problem Statement

You are given a binary string `s` (containing only `'0'` and `'1'`) **with no leading zeros**.  
Return `true` if the string contains **at most one contiguous segment of ones (`'1'`)**, otherwise return `false`.

---

## 💡 Examples

### Example 1
**Input:**
```python
s = "1001"

Output: false

Explanation: There are two separate segments of '1' — "1" at the beginning and another "1" at the end.

Example 2
Input:

s = "110"

Output: true

Explanation: All the '1's are grouped together at the start.