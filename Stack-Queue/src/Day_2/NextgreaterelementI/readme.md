# 496. Next Greater Element I

**Difficulty:** Easy  
**Tags:** Stack, Hash Map, Array

---

## 🧩 Problem Statement

The **next greater element** of some element `x` in an array is the first **greater element to the right** of `x` in the same array.

You're given two **distinct 0-indexed integer arrays** `nums1` and `nums2`, where `nums1` is a **subset** of `nums2`.

For each element in `nums1`, you must:
- Find its index in `nums2`.
- Determine the next greater element to the right of that index in `nums2`.
- If there is no next greater element, return `-1`.

Return an array `ans` where `ans[i]` is the next greater element of `nums1[i]` as described above.

---

## 🧪 Examples

### Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation:

4 → -1 (no greater number after it)

1 → 3

2 → -1


### Example 2:
Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation:

2 → 3

4 → -1