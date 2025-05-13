# ✅ LeetCode 2000 - Reverse Prefix of Word

## 📝 Problem Statement

Given a 0-indexed string `word` and a character `ch`,  
**reverse the segment of the string from index `0` to the first occurrence of `ch` (inclusive)**.

- If `ch` is not found in `word`, return the original string unchanged.

---

## 💡 Examples

### Example 1
**Input:**
```python

word = "abcdefd"

ch = "d"

Output: "dcbaefd"

Explanation:

'd' is at index 3. Reverse the part abcd → dcba → final: dcbaefd

Example 2
Input:

word = "xyxzxe"

ch = "z"

Output: "zxyxxe"

Explanation:

'z' is at index 3. Reverse xyxz → zxyx → final: zxyxxe