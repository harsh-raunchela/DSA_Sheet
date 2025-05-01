# 📈 1854. Maximum Population Year

**Difficulty:** Easy  
**Link:** [LeetCode - Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)

---

## 🧠 Problem Summary

You're given a list of people's birth and death years.  
Each person is **counted as alive from birth up to the year before their death**.

Your goal is to find the **year with the highest population**, and if there are multiple, return the **earliest one**.

---

## 📥 Input

- `logs`: List of lists, where each `logs[i] = [birth_i, death_i]` (both are integers)

---

## 📤 Output

- An integer representing the **earliest year** that had the **maximum population**

---

## 🧩 Examples

### Example 1
```text
Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: Each person counts from their birth year up to the year before they die.
- Person 1: 1993 to 1998
- Person 2: 2000 to 2009
Both years have max 1 population, earliest is 1993.


Example 2 

Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation:
- 1960 and 1970 both had population of 2.
- Return the earliest: 1960.
