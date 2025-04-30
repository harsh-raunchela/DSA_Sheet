# 🏃‍♂️ 55. Jump Game

**Difficulty:** Medium  
**Tags:** Greedy, Dynamic Programming, Array

---

## 🧠 Problem Statement

You are given an integer array `nums`. Initially, you are positioned at the **first index**, and each element in the array represents the maximum number of indices you can jump forward from that position.

Your task is to return `true` if you can reach the **last index** from the first index, or `false` otherwise.

---

## 📥 Input

- `nums`: An array of non-negative integers, where each element `nums[i]` represents the maximum jump length from that position.

## 📤 Output

- `true` if you can reach the last index, otherwise `false`.

---

## 🧪 Examples

### Example 1:
```text
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.


Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
