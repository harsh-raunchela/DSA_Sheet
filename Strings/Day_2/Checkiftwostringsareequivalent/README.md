# ✅ LeetCode 1662 - Check If Two String Arrays are Equivalent

## 📝 Problem Statement

You're given two string arrays `word1` and `word2`.  
Check if the **concatenation of all strings in `word1`** is equal to the **concatenation of all strings in `word2`**.

Return `true` if they are the same string, otherwise return `false`.

---

## 📥 Input

- `word1`: array of strings.
- `word2`: array of strings.

## 📤 Output

- Boolean: `true` if both arrays form the same string when concatenated, else `false`.

---

## 🧠 Examples

### Example 1
**Input:**
```text
word1 = ["ab", "c"]
word2 = ["a", "bc"]


OUTPUT : 

True

Explanation:
"ab" + "c" = "abc", and "a" + "bc" = "abc"


Example 2
Input:

word1 = ["a", "cb"]
word2 = ["ab", "c"]


OUTPUT :

false


