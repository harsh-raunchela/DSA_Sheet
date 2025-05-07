# 📝 LeetCode 1859 - Sorting the Sentence

## 🧩 Problem Statement

A sentence is formed by words separated by **a single space**, with no leading or trailing spaces. In a **shuffled sentence**, each word has a number at the end representing its original 1-based position.

Your task is to reconstruct the **original sentence** from this shuffled version.

---

## 🧠 Examples

### Example 1
**Input:**  
`s = "is2 sentence4 This1 a3"`

**Output:**  
`"This is a sentence"`

**Explanation:**  
After sorting by the numbers:
- "This1" → "This"
- "is2" → "is"
- "a3" → "a"
- "sentence4" → "sentence"

Final sentence: `"This is a sentence"`

---

### Example 2
**Input:**  
`s = "Myself2 Me1 I4 and3"`

**Output:**  
`"Me Myself and I"`

---