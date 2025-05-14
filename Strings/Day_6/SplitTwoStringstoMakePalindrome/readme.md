# 1616. Split Two Strings to Make Palindrome

## 🧩 Problem Statement

You are given two strings `a` and `b` of the same length. Choose an index and split both strings at the same index. A split divides each string into a **prefix** and **suffix**.

For example, if `a = "abc"` and you split at index 1:
- `aprefix = "a"`, `asuffix = "bc"`

Do the same with `b`, and check whether:
- `aprefix + bsuffix` or
- `bprefix + asuffix`

forms a **palindrome**.

You may split at any index (including 0 and the full length). Either prefix or suffix can be an empty string.

Return `true` if it's possible to form a palindrome, otherwise `false`.

---

## 🧠 Example

### Example 1:
Input: a = "x", b = "y"
Output: true
Explanation: "" + "y" = "y", which is a palindrome.


### Example 2:
Input: a = "xbdef", b = "xecab"
Output: false



### Example 3:
Input: a = "ulacfd", b = "jizalu"
Output: true
Explanation:
Split at index 3:
a → "ula" + "cfd"
b → "jiz" + "alu"
"ula" + "alu" = "ulaalu" → palindrome ✅