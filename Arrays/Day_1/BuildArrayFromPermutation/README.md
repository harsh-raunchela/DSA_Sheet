# 1920. Build Array from Permutation

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

Given a zero-based permutation `nums` (0-indexed), build an array `ans` of the same length where  
for each `0 <= i < nums.length`, and return it.

A zero-based permutation `nums` is an array of distinct integers from `0` to `nums.length - 1` (inclusive).

---

## Hint

Compute each output directly by indexing into `nums` twice; no extra data structures beyond the output array are needed:
```python
ans[i] = nums[nums[i]]


Examples
Example 1

Input:  nums = [0, 2, 1, 5, 3, 4]
Output: [0, 1, 2, 4, 5, 3]
Explanation:
ans = [
  nums[nums[0]],  # nums[0]=0 → nums[0]=0
  nums[nums[1]],  # nums[1]=2 → nums[2]=1
  nums[nums[2]],  # nums[2]=1 → nums[1]=2
  nums[nums[3]],  # nums[3]=5 → nums[5]=4
  nums[nums[4]],  # nums[4]=3 → nums[3]=5
  nums[nums[5]]   # nums[5]=4 → nums[4]=3
] = [0,1,2,4,5,3]

Example 2

Input:  nums = [5, 0, 1, 2, 3, 4]
Output: [4, 5, 0, 1, 2, 3]
Explanation:

ans = [
  nums[nums[0]],  # nums[0]=5 → nums[5]=4
  nums[nums[1]],  # nums[1]=0 → nums[0]=5
  nums[nums[2]],  # nums[2]=1 → nums[1]=0
  nums[nums[3]],  # nums[3]=2 → nums[2]=1
  nums[nums[4]],  # nums[4]=3 → nums[3]=2
  nums[nums[5]]   # nums[5]=4 → nums[4]=3
] = [4,5,0,1,2,3]