# LeetCode 1678 — Goal Parser Interpretation

**Difficulty:** Easy  
**Topics:** String, Parsing

---

## 🧠 Problem Statement

You are given a string `command` made up of:

- `"G"`
- `"()"`
- `"(al)"`

You need to interpret it using the following rules:

- `"G"` ➝ `"G"`
- `"()"` ➝ `"o"`
- `"(al)"` ➝ `"al"`

> Return the final interpreted string by replacing each symbol with its corresponding meaning.

---

## ✅ Examples

### Example 1:
Input: command = "G()(al)"

Output: "Goal"


### Example 2:
Input: command = "G()()()()(al)"

Output: "Gooooal"


### Example 3:
Input: command = "(al)G(al)()()G"

Output: "alGalooG"