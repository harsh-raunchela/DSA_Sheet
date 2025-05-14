# 1813. Sentence Similarity III

## 🧩 Problem Statement

You are given two strings `sentence1` and `sentence2`, each representing a sentence composed of words separated by single spaces (no leading or trailing spaces).

Two sentences are considered **similar** if you can insert an arbitrary sentence (including an empty one) into **either** of them such that both become **exactly equal**.  
The inserted sentence must be properly **separated by spaces**.

---

## 🧠 Examples

### Example 1:
Input: sentence1 = "My name is Haley", sentence2 = "My Haley"
Output: true
Explanation: "name is" can be inserted between "My" and "Haley" in sentence2.



### Example 2:
Input: sentence1 = "of", sentence2 = "A lot of words"
Output: false
Explanation: No way to insert a proper sentence into either to match the other.


### Example 3:
Input: sentence1 = "Eating right now", sentence2 = "Eating"
Output: true
Explanation: "right now" can be added to the end of sentence2.