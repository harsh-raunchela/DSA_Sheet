# 🧑‍🤝‍🧑 The Celebrity Problem

**Difficulty:** Medium  
**Accuracy:** 38.33%  
**Average Time:** 30 mins  
**Submissions:** 314K+  
**Points:** 4

## 🚩 Problem Statement

A **celebrity** is defined as a person who:
- Is **known by everyone** else at the party
- **Does not know anyone** at the party

You're given a `n x n` square matrix `mat[][]` where:
- `mat[i][j] == 1` means **person i knows person j**
- `mat[i][j] == 0` means **person i does NOT know person j**
- `mat[i][i] == 1` for all i (self-knowledge is always true)

Your task is to return the **index of the celebrity** in the party.  
If no celebrity exists, return `-1`.

> 📌 Follow 0-based indexing.

---

## 🧠 Constraints

- `1 <= mat.length <= 1000`
- `0 <= mat[i][j] <= 1`
- `mat[i][i] == 1` (every person knows themselves)

---

## 🔍 Examples

### Example 1:
**Input:**
```java
mat = [
  [1, 1, 0],
  [0, 1, 0],
  [0, 1, 1]
]
Output: 1
Explanation:
Person 1 is known by person 0 and 2, and they know no one.

Example 2:
Input:


mat = [
  [1, 1],
  [1, 1]
]
Output: -1
Explanation:
Everyone knows everyone else. No one fits the celebrity rule.

Example 3:
Input:

mat = [
  [1]
]
Output: 0
Explanation:
Only one person is trivially the celebrity.