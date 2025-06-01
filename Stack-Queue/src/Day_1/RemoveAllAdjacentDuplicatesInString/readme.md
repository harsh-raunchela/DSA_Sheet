# 🧹 1047. Remove All Adjacent Duplicates In String

> Easy | Stack | String | LeetCode

---

## 📌 Problem Statement

You are given a string `s` consisting of **lowercase English letters**. A **duplicate removal** consists of choosing two **adjacent and equal letters** and removing them.

We repeatedly make duplicate removals on `s` **until no more are possible**.

Return the **final string** after all such duplicate removals have been made. It can be proven that the answer is unique.

---

## ✍️ Examples

### Example 1:

**Input:**  
`s = "abbaca"`

**Output:**  
`"ca"`

**Explanation:**
- Remove "bb" → "aaca"
- Then remove "aa" → "ca"

---

### Example 2:

**Input:**  
`s = "azxxzy"`

**Output:**  
`"ay"`

**Explanation:**
- Remove "xx" → "azzy"
- Remove "zz" → "ay"

---

## ✅ Constraints

- `1 <= s.length <= 10⁵`
- `s` consists of lowercase English letters only.

---