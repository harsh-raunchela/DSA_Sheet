# 🎯 1389. Create Target Array in the Given Order

**Difficulty:** Easy  
**Tags:** Array, Simulation, Insertion

---

## 🧠 Problem Statement

You are given two integer arrays `nums` and `index`. Create a **target** array using the following rules:

- Start with an empty target array.
- Read each element from left to right:
    - Insert `nums[i]` at position `index[i]` in the target array.
- Repeat until all elements are inserted.

Return the final target array.

👉 It is guaranteed that all insert operations are valid.

---

## 📥 Input

- `nums`: Array of integers
- `index`: Array of integers (same length as `nums`)

---

## 📤 Output

- A new array `target` constructed following the given rules.

---

## 🧪 Examples

### Example 1:

Input: nums = [0,1,2,3,4] index = [0,1,2,2,1] Output: [0,4,1,3,2]

Step-by-step: Insert 0 at index 0 → [0]
Insert 1 at index 1 → [0,1]
Insert 2 at index 2 → [0,1,2]
Insert 3 at index 2 → [0,1,3,2]
Insert 4 at index 1 → [0,4,1,3,2]


### Example 2:


Input: nums = [1,2,3,4,0] index = [0,1,2,3,0] Output: [0,1,2,3,4]


### Example 3:


Input: nums = [1] index = [0] Output: [1]