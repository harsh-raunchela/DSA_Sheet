# 🧩 1673. Find the Most Competitive Subsequence

**Difficulty:** Medium  
**Topics:** Greedy, Stack  
**Tags:** Array, Monotonic Stack

---

## 🔍 Problem Statement

Given an integer array `nums` and a positive integer `k`, return the **most competitive subsequence** of `nums` of size `k`.

An array's **subsequence** is a sequence that can be derived by deleting some or no elements without changing the order of the remaining elements.

A subsequence `a` is **more competitive** than a subsequence `b` (of the same length) if at the first position where `a` and `b` differ, `a[i] < b[i]`.

---

## 💡 Examples

### Example 1:
Input: nums = [3, 5, 2, 6], k = 2
Output: [2, 6]
Explanation: Possible subsequences → [3,5], [3,2], [3,6], [5,2], [5,6], [2,6]
Most competitive is [2,6]


### Example 2:
Input: nums = [2, 4, 3, 3, 5, 4, 9, 6], k = 4
Output: [2, 3, 3, 4]