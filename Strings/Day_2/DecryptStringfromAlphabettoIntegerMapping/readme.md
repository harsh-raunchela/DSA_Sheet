# 🔓 LeetCode 1309 - Decrypt String from Alphabet to Integer Mapping

## 📝 Problem Statement

You're given a string `s` formed by digits and the `#` symbol. Map this string to English lowercase letters based on the following rules:

- `'1'` to `'9'` maps to `'a'` to `'i'`
- `'10#'` to `'26#'` maps to `'j'` to `'z'`

Return the decrypted string.

> The mapping is guaranteed to be valid and uniquely decodable.

---

## 📥 Input

- A string `s` consisting of digits and the `#` symbol.

## 📤 Output

- A string representing the decoded version of `s`.

---

## 🧠 Examples

### Example 1

**Input:**
```text
s = "10#11#12"
Output:

"jkab"

Explanation:

"10#" → "j"

"11#" → "k"

"1" → "a"

"2" → "b"

Example 2
Input:

s = "1326#"


Output:

"acz"


Explanation:

"1" → "a"

"3" → "c"

"26#" → "z"

