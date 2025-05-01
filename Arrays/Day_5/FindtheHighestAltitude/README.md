# 🏔️ 1732. Find the Highest Altitude

**Difficulty:** Easy  
**Link:** [LeetCode - Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)

---

## 🧠 Problem Summary

You're given an array `gain[]` representing the net gain/loss in altitude between checkpoints on a biker's trip.  
The trip starts at **altitude 0**, and `gain[i]` indicates the altitude change from point `i` to `i + 1`.

Your task is to find the **highest altitude** reached during the trip.

---

## 📥 Input

- `gain`: Integer array of length `n` (where `gain[i]` is the altitude change from point `i` to `i+1`)

---

## 📤 Output

- An integer representing the **maximum altitude** reached during the trip

---

## 🧩 Examples

### Example 1
```text
Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: Altitudes = [0, -5, -4, 1, 1, -6]


Example 2

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: Altitudes = [0, -4, -7, -9, -10, -6, -3, -1]
