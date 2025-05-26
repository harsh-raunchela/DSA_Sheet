# 🔗 160. Intersection of Two Linked Lists

**Difficulty:** Easy  
**Topics:** Linked List, Two Pointers  
**Companies:** Amazon, Google, Facebook

---

## 🧠 Problem Statement

Given the heads of two singly linked lists `headA` and `headB`, return the node where the two lists **intersect**. If there’s **no intersection**, return `null`.

> Two nodes intersect if they are literally the *same object in memory* (not just same value).

---

## 🧪 Examples

### Example 1:
Input:
listA = [4,1,8,4,5]
listB = [5,6,1,8,4,5]
Output: Intersected at '8'


### Example 2:
Input:
listA = [1,9,1,2,4]
listB = [3,2,4]
Output: Intersected at '2'


### Example 3:
Input:
listA = [2,6,4]
listB = [1,5]
Output: No intersection (null)