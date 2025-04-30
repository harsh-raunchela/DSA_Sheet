# 🔢 1365. How Many Numbers Are Smaller Than the Current Number

**Difficulty:** Easy  
**Tag(s):** Array, Brute Force, Counting

---

## 🧠 Problem Statement

Given the array `nums`, for each `nums[i]`, find out **how many numbers in the array are smaller than it**.

Return the answer in an array.

---

## 📥 Input

- `nums`: An array of integers (length ≤ 500)

---

## 📤 Output

- A new array where each element at index `i` represents how many numbers in `nums` are smaller than `nums[i]`.

---

## 🔍 Examples

### Example 1:
```text
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]

Explanation:
- 8 has 4 numbers smaller than it.
- 1 has 0.
- 2 has 1.
- 2 has 1.
- 3 has 3.

Example 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]


Example 3:

Input: nums = [7,7,7,7]
Output: [0,0,0,0]
