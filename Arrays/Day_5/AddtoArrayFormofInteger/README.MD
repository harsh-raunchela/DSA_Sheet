# 🧮 989. Add to Array-Form of Integer

**Difficulty:** Easy  
**Link:** [LeetCode - Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)

---

## 🧠 Problem Summary

The **array-form** of an integer `num` is simply an array representing its digits from left to right.

You're given:
- `num` (as an array of digits)
- `k` (an integer)

You must return the array-form of the sum `num + k`.

---

## 📥 Input

- `num`: List of integers (e.g. `[1,2,0,0]`)
- `k`: Integer to add to `num`

---

## 📤 Output

- List of integers representing the array-form of `num + k`

---

## 🧩 Examples

### Example 1
```text
Input: num = [1,2,0,0], k = 34  
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234


Example 2

Input: num = [2,7,4], k = 181  
Output: [4,5,5]
Explanation: 274 + 181 = 455


Example 3

Input: num = [2,1,5], k = 806  
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
