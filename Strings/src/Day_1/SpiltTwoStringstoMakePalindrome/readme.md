# LeetCode 1616 – Split Two Strings to Make Palindrome

**Difficulty:** Medium  
**Topics:** Two Pointers, Greedy, String  
**Companies:** Amazon, Google, Bloomberg

---

## 🧠 Problem Statement

You're given two strings `a` and `b`, both of the same length. You can choose an index and **split both strings at the same index**.

You then check if **`aPrefix + bSuffix`** or **`bPrefix + aSuffix`** forms a palindrome.

Return `true` if such a combination exists, otherwise `false`.

---

### 📘 Definitions

- Split `a` into `aPrefix + aSuffix`
- Split `b` into `bPrefix + bSuffix`
- Check if:
    - `aPrefix + bSuffix` is a palindrome, or
    - `bPrefix + aSuffix` is a palindrome

> Note: Empty splits are allowed (e.g., `"" + a` or `b + ""`)

---

## ✅ Examples

### Example 1:
```text
Input: a = "x", b = "y"
Output: true

Explanation: 
Split both at index 0:
aPrefix = "", aSuffix = "x"
bPrefix = "", bSuffix = "y"
Then: aPrefix + bSuffix = "y" → which is a palindrome.


EXAMPLE 2 :

Input: a = "xbdef", b = "xecab"
Output: false

EXAMPLE 3:

Input: a = "ulacfd", b = "jizalu"
Output: true

Explanation:
Split at index 3:
aPrefix = "ula", aSuffix = "cfd"
bPrefix = "jiz", bSuffix = "alu"
Then: aPrefix + bSuffix = "ulaalu", which is a palindrome.
