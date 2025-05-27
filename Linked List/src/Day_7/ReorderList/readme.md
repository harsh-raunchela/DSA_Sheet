# 🔁 143. Reorder List

**Difficulty:** Medium  
**Topics:** Linked List, Two Pointers, Stack  
**Companies:** Amazon, Facebook, Google, Microsoft

---

## 🧠 Problem Statement

You’re given the head of a singly linked list:

L0 → L1 → L2 → ... → Ln-1 → Ln

**Reorder it** to:

L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → ...


### ⚠️ Rules:
- You **can’t just swap values** (no cheating 🙅‍♀️).
- You **have to move the actual nodes**.

---

## 🧪 Examples

### Example 1:
```python
Input:  head = [1,2,3,4]
Output: [1,4,2,3]


Example 2:


Input:  head = [1,2,3,4,5]
Output: [1,5,2,4,3]