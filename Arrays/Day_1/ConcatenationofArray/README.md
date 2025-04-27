# 1929. Concatenation of Array

**Status:** Solved ✅  
**Difficulty:** Easy

---

## Topics
- Array
- Simulation

## Companies
*(No company tags for this problem)*

---

## Problem Description

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` where:  
ans[i] = nums[i] ans[i + n] = nums[i]
for every `0 <= i < n` (0-indexed).

Specifically, `ans` is the concatenation of two `nums` arrays.

Return the array `ans`.

---

## Hint

You can just simulate the process of writing `nums` twice back-to-back in a new array.

---

## Examples

**Example 1**  
Input: nums = [1, 2, 1] Output: [1, 2, 1, 1, 2, 1]

**Example 2**  
Input: nums = [1, 3, 2, 1] Output: [1, 3, 2, 1, 1, 3, 2, 1]