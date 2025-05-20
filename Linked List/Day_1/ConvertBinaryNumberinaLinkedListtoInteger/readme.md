# 🔢 1290. Convert Binary Number in a Linked List to Integer

**Difficulty:** Easy  
**Topics:** Linked List, Bit Manipulation

---

## 📝 Problem Statement

You are given the `head` of a **singly linked list**, where each node contains either a `0` or `1`, representing a **binary number**.

Return the **decimal (base-10)** value of the binary number.  
📌 The **most significant bit (MSB)** is at the **head** of the list.

---

## 📥 Examples

### Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: Binary 101 = Decimal 5

### Example 2:
Input: head = [0]
Output: 0

---

## 💡 Intuition

Think of the linked list as a stream of bits. As you traverse it:

- Multiply your current result by 2 (left shift),
- Add the current node’s value (`0` or `1`).

This mimics how binary numbers are read left-to-right.

---

## 🔄 Approach

### 1. **Initialize** `num = 0`
### 2. **Traverse** the linked list:
- Update: `num = num * 2 + node.val`
### 3. **Return** `num`

---