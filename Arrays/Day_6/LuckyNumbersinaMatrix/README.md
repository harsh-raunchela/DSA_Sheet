# 🍀 1380. Lucky Numbers in a Matrix

**Difficulty:** Easy  
**Category:** Matrix / Array  
**Link:** [LeetCode - Lucky Numbers in a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)

---

## 📝 Problem Statement

Given an `m x n` matrix of **distinct** numbers, return **all lucky numbers** in the matrix in any order.

A **lucky number** is an element of the matrix such that it is:
1. The **minimum element in its row**.
2. The **maximum element in its column**.

---

## 🧠 Examples

### Example 1:
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]

Output: [15]

Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.


### Example 2:
Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]

Output: [12]

Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.



### Example 3:
Input: matrix = [[7,8],[1,2]]

Output: [7]

Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.