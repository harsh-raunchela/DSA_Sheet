# LeetCode Problem 1217 — Minimum Cost to Move Chips to The Same Position

**Difficulty:** Easy  
**Topics:** Greedy, Math

---

## 🧠 Problem Statement

You are given an array `position` representing the positions of `n` chips.

You can move a chip from its current position to:
- `position + 2` or `position - 2` **with cost = 0**
- `position + 1` or `position - 1` **with cost = 1**

Your task is to return the **minimum cost** needed to move **all chips to the same position**.

---

## 🔍 Examples

### Example 1:
Input: position = [1,2,3]

Output: 1

Explanation:

Move chip at 3 to 1 (cost = 0)

Move chip at 2 to 1 (cost = 1)
Total cost = 1


### Example 2:
Input: position = [2,2,2,3,3]

Output: 2

Explanation:

Move both chips at 3 to 2 (1 cost each)
Total cost = 2