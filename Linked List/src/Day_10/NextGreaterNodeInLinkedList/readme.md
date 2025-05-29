# 🧠 1019. Next Greater Node In Linked List

> **Difficulty:** Medium  
> **Tags:** Linked List, Stack, Brute Force  
> **LeetCode Link:** [Next Greater Node in Linked List](https://leetcode.com/problems/next-greater-node-in-linked-list/)

---

## 📄 Problem Statement

You are given the head of a singly linked list with `n` nodes.  
For each node in the list, find the **next node** that has a **strictly larger value**.

Return an integer array `answer` such that:
- `answer[i]` is the value of the next greater node of the `i-th` node *(1-indexed)*.
- If no such node exists, set `answer[i] = 0`.

---

## 📥 Input

- A singly linked list of `n` nodes.
- Each node has a value: `1 <= Node.val <= 10^9`
- Total nodes: `1 <= n <= 10^4`

---

## 📤 Output

- An integer array where each element represents the next greater node’s value, or `0` if none exists.

---

## 🧪 Examples

### Example 1:
Input: head = [2, 1, 5]
Output: [5, 5, 0]


### Example 2:
Input: head = [2, 7, 4, 3, 5]
Output: [7, 0, 5, 5, 0]