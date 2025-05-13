# ✅ LeetCode 1768 - Merge Strings Alternately

## 📝 Problem Statement

You are given two strings `word1` and `word2`.  
Merge the strings by **alternating characters** from each word, starting with `word1`.  
If one string is longer than the other, **append the remaining characters** at the end of the merged result.

---

## 💡 Examples

### Example 1

**Input:**
```python
word1 = "abc"

word2 = "pqr"

Output: "apbqcr"

Explanation:

Characters are taken alternately → a from word1, p from word2, then b, q, then c, r.

Example 2

Input:

word1 = "ab"

word2 = "pqrs"

Output: "apbqrs"


Explanation:

After a-p-b-q, rs is left from word2 and is added to the end.