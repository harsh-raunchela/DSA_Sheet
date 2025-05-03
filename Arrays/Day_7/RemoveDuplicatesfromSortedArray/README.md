# LeetCode Problem 26 — Remove Duplicates from Sorted Array

**Difficulty:** Easy  
**Topics:** Array, Two Pointers

---

## 🧠 Problem Statement

Given an **integer array `nums` sorted in non-decreasing order**, remove the duplicates **in-place** such that each unique element appears **only once**.  
The relative order of the elements should be kept the same.

You must return the number of unique elements, `k`, and modify the input array `nums` such that the first `k` elements are the unique ones.

> ⚠️ The remaining elements beyond `k` are not important.

---

## 🔍 Examples

### Example 1:
Input: nums = [1,1,2]

Output: k = 2, nums = [1,2,_]

Explanation: The first 2 elements of nums should be [1,2].


### Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]

Output: k = 5, nums = [0,1,2,3,4,_...]

Explanation: The first 5 elements are unique.