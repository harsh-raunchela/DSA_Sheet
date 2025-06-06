# 🧩 Leetcode 456: 132 Pattern (Medium)

## 📝 Problem Statement

Given an array of `n` integers `nums`, a **132 pattern** is a subsequence of **three integers** `nums[i]`, `nums[j]`, and `nums[k]` such that:

i < j < k
nums[i] < nums[k] < nums[j]

yaml
Copy code

Return `true` if there is at least one **132 pattern** in `nums`, otherwise return `false`.

---

## 📌 Examples

### Example 1:
```text
Input: nums = [1, 2, 3, 4]
Output: false
Explanation: There is no 132 pattern in the sequence.
Example 2:

Input: nums = [3, 1, 4, 2]
Output: true
Explanation: The pattern [1, 4, 2] follows the 132 pattern.
Example 3:

Input: nums = [-1, 3, 2, 0]
Output: true
Explanation: Patterns [-1, 3, 2], [-1, 3, 0], and [-1, 2, 0] all foll