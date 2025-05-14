# 🔢 LeetCode 1871 - Jump Game VII

## 📝 Problem Statement

You are given a **binary string** `s` and two integers `minJump` and `maxJump`.

You start at index `0` (where `s[0] == '0'`). From index `i`, you can jump to any `j` such that:

- `i + minJump <= j <= min(i + maxJump, s.length - 1)`
- and `s[j] == '0'`

Return `True` if you can reach the last index of the string, otherwise return `False`.

---

## 💡 Examples

### Example 1:
**Input:**
```python
s = "011010"
minJump = 2
maxJump = 3
Output: True
Explanation:

Jump from 0 → 3 (within [2,3])

Then 3 → 5 (within [5,6])

Example 2:
Input:

s = "01101110"
minJump = 2
maxJump = 3
Output: False
Explanation: There's no valid way to reach the last index.