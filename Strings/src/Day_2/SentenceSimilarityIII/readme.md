# 📝 LeetCode 1813 - Sentence Similarity III

## 🧩 Problem Statement

You're given two strings, `sentence1` and `sentence2`, each representing a sentence made up of words separated by **single spaces**.

Two sentences are **similar** if you can insert a sentence (possibly empty) inside one of them such that the result equals the other.

The inserted sentence must be **separated by spaces** from the original words.

---

## 🧠 Examples

### Example 1
**Input:**  
`sentence1 = "My name is Haley"`  
`sentence2 = "My Haley"`  
**Output:**  
`true`  
**Explanation:** You can insert `"name is"` between `"My"` and `"Haley"` in sentence2 to get sentence1.

---

### Example 2
**Input:**  
`sentence1 = "of"`  
`sentence2 = "A lot of words"`  
**Output:**  
`false`

---

### Example 3
**Input:**  
`sentence1 = "Eating right now"`  
`sentence2 = "Eating"`  
**Output:**  
`true`  
**Explanation:** `"right now"` can be added after `"Eating"` to form sentence1.

---

## ✅ Constraints

- `1 <= sentence1.length, sentence2.length <= 100`
- Sentences only contain uppercase/lowercase English letters and single spaces
- Words are separated by a single space, with **no leading/trailing** spaces

---
