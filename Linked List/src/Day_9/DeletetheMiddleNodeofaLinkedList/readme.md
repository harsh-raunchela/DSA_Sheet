# 🧠 LeetCode 2095: Delete the Middle Node of a Linked List

**Difficulty:** Medium  
**Topic:** Linked List  
**Tag:** Fast & Slow Pointer, Two-Pointer Technique

---

## 📝 Problem Statement

You are given the **head** of a **singly linked list**.  
Delete the **middle node**, and return the **head** of the modified linked list.

The middle node of a linked list of size `n` is the `⌊n / 2⌋`-th node (0-based indexing).  
Where `⌊x⌋` denotes the greatest integer less than or equal to `x`.

---

## 📊 Examples

### Example 1:
Input: head = [1, 3, 4, 7, 1, 2, 6]
Output: [1, 3, 4, 1, 2, 6]
Explanation:
The node with value 7 (index 3) is the middle node and is deleted.


### Example 2:
Input: head = [1, 2, 3, 4]
Output: [1, 2, 4]
Explanation:
Middle node is value 3 (index 2), which is removed.

### Example 3:
Input: head = [2, 1]
Output: [2]
Explanation:
Middle node is value 1 (index 1). Only 2 remains after removal.

---

## ✅ Constraints

- The number of nodes in the list is in the range **[1, 10⁵]**
- `1 <= Node.val <= 10⁵`

---