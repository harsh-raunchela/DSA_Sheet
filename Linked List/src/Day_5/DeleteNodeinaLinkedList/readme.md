# 🧹 237. Delete Node in a Linked List

**Difficulty:** Medium  
**Topics:** Linked List  
**Companies:** Facebook, Amazon, Microsoft, Apple

---

## 📝 Problem Statement

You are given a **node** in a singly-linked list (not the head).  
Your job is to **delete this node** from the linked list.

📌 You **do not have access** to the `head` of the list.  
📌 Also, the given node **won’t be the last** node in the list.

---

## 💡 Intuition

You can’t go backward and update the previous node’s `next`,  
so the trick is:  
➡️ Copy the **next node’s value** into the current node  
➡️ Then, **delete the next node** instead!

It’s like shifting everything back by one.

---

## 🔓 Constraints

- 2 ≤ number of nodes ≤ 1000
- Node values are unique
- Node to be deleted is **not the tail node**

---

## 📥 Examples

### Example 1:
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]

Explanation: You’re given the node with value `5`. After deleting, the list becomes `4 -> 1 -> 9`.

---

### Example 2:
Input: head = [4,5,1,9], node = 1
Output: [4,5,9]