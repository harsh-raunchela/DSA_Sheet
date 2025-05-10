# 🧩 LeetCode 1859 - Sorting the Sentence

## 📝 Problem Statement

You are given a shuffled sentence where:
- Each word ends with a digit from 1 to 9.
- The digit indicates the correct position of that word in the original sentence.

Your task is to **reconstruct the original sentence** and return it as a string (without the position digits).

---

## 📥 Input

- `s`: A shuffled sentence string of 1–9 words.
    - Each word ends with a number indicating its correct position.
    - Words are separated by a single space.
    - No leading or trailing spaces.

## 📤 Output

- A string representing the original sentence in the correct order.

---

## 🧠 Examples

### Example 1
**Input:**

s = "is2 sentence4 This1 a3"

**Output:**

"This is a sentence"



### Example 2
**Input:**

s = "Myself2 Me1 I4 and3"

**Output:**

"Me Myself and I"