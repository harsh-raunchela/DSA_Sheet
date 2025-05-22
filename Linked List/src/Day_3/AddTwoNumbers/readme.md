# ➕ 2. Add Two Numbers

**Difficulty:** Medium  
**Topics:** Linked List, Math, Recursion  
**Companies:** Amazon, Microsoft, Google, Facebook

---

## 📝 Problem Statement

You are given two **non-empty** linked lists representing two non-negative integers.  
The digits are stored in **reverse order**, and **each node contains a single digit**.

Add the two numbers and return the result as a linked list.

### ✅ Constraints:
- Each list has **1 to 100** nodes.
- Each node’s value is between **0 to 9**.
- The numbers have **no leading zeros**, except the number `0` itself.

---

## 📥 Examples

### Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807


### Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

### Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]