# 🔍 34. Find First and Last Position of Element in Sorted Array

**Difficulty:** Medium  
**Tags:** Binary Search, Array

---

## 🧠 Problem Statement

You are given an array of integers `nums` sorted in non-decreasing order.  
Your task is to find the **first and last** position of a given `target` value.

Return `[-1, -1]` if the target is not present in the array.

🧩 You must solve this in **O(log n)** time complexity.

---

## 📥 Input

- `nums`: An array of integers sorted in non-decreasing order.
- `target`: Integer value to find in the array.

## 📤 Output

- An array of two integers representing the **starting** and **ending** index of the target.

---

## 🧪 Examples

### Example 1:
```text
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]


Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]


Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
