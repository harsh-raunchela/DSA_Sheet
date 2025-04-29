# 🍭 1431. Kids With the Greatest Number of Candies

**Difficulty:** Easy  
**Topic:** Arrays

---

## 🧠 Problem Statement

You are given an array `candies` where `candies[i]` is the number of candies the `i-th` kid has, and an integer `extraCandies`, representing candies you can give to **one kid at a time**.

Return a boolean array where each element tells if giving the `extraCandies` to that kid makes them have **the greatest number of candies** among all kids.

---

## 📥 Input

- `candies`: Integer array of length `n`
- `extraCandies`: Integer

---

## 📤 Output

- Boolean array of length `n`

Each value is:
- `true` → if the kid can have the most candies after getting the `extraCandies`
- `false` → otherwise

---

## ✅ Examples

```text

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true, true, true, false, true]


Example 2: 

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true, false, false, false, false]


Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true, false, true]
