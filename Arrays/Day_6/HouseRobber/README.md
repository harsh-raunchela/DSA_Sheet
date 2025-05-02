# 🏚️ 198. House Robber

**Difficulty:** Medium  
**Category:** Dynamic Programming  
**Link:** [LeetCode - House Robber](https://leetcode.com/problems/house-robber/)

---

## 📝 Problem Statement

You're a professional robber planning to rob houses along a street.  
Each house has some amount of money, but adjacent houses are connected to security systems — robbing two **adjacent** houses will trigger the alarm. 🚨

Given an integer array `nums` representing the money in each house, return the **maximum amount** you can rob **without alerting the police**.

---

## 🧠 Examples

### Example 1:
Input: nums = [1,2,3,1]

Output: 4

Explanation: Rob house 0 (money = 1) and house 2 (money = 3).
Total = 1 + 3 = 4


### Example 2:
Input: nums = [2,7,9,3,1]

Output: 12

Explanation: Rob house 0 (2) + house 2 (9) + house 4 (1)
Total = 2 + 9 + 1 = 12
