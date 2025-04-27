# 1480. Running Sum of 1d Array

**Status:** Solved ✅  
**Difficulty:** Easy

---

## Topics
- Array
- Prefix Sum

## Companies
*(No company tags for this problem)*

---

## Problem Description

Given an array `nums`, we define a **running sum** of the array as:
runningSum[i] = sum(nums[0] + nums[1] + ... + nums[i])

Return the running sum of `nums`.

---

## Hint

You can build the `runningSum` array by iterating through `nums` and at each step, adding the previous sum to the current number.

---

## Examples

**Example 1**  
Input: nums = [1, 2, 3, 4] Output: [1, 3, 6, 10]

**Example 2**

Input: nums = [1, 1, 1, 1, 1] Output: [1, 2, 3, 4, 5]
