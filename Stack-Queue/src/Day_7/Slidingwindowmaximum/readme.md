# 239. Sliding Window Maximum 📊

> **Difficulty**: Hard  
> **Tags**: Monotonic Queue, Deque, Heap, Sliding Window  
> **Platform**: LeetCode  
> **Status**: ✅ Solved

---

## 📝 Problem Statement

You are given an array of integers `nums`, and a sliding window of size `k` that moves from the **left** to the **right** of the array.

At each position, return the **maximum** value in the current window.

---

## 📥 Input

- `nums`: an integer array where `1 <= nums.length <= 10⁵`
- `k`: an integer window size such that `1 <= k <= nums.length`

Each element of `nums` is in the range `[-10⁴, 10⁴]`.

---

## 📤 Output

- Return an integer array of the **maximums** in each sliding window of size `k`.

---

## 💡 Examples

### Example 1:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]

Explanation:
Window positions Max

[1 3 -1] -3 5 3 6 7 3
1 [3 -1 -3] 5 3 6 7 3
1 3 [-1 -3 5] 3 6 7 5
1 3 -1 [-3 5 3] 6 7 5
1 3 -1 -3 [5 3 6] 7 6
1 3 -1 -3 5 [3 6 7] 7


### Example 2:
Input: nums = [1], k = 1
Output: [1]