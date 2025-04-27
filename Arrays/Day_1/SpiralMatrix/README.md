# 54. Spiral Matrix

**Status:** Solved ✅  
**Difficulty:** Medium

---

## Topics
- Array
- Matrix
- Simulation

## Companies
*(Commonly asked in tech interviews!)*

---

## Problem Description

Given an `m x n` matrix, return all elements of the matrix in **spiral order**.

In spiral order, you go:
- Right ➡️
- Down ⬇️
- Left ⬅️
- Up ⬆️
  and keep repeating this pattern.

---

## Hint

Think about maintaining four boundaries: `top`, `bottom`, `left`, and `right`.  
Each time you complete a direction (right, down, left, or up), you adjust the boundaries accordingly.

---

## Examples

**Example 1**  
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]] Output: [1,2,3,6,9,8,7,4,5]


**Example 2**  
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]] Output: [1,2,3,4,8,12,11,10,9,5,6,7]



