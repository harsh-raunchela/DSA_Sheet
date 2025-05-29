# 🎲 382. Linked List Random Node

> **Level:** Medium  
> **Topic:** Data Structures (Linked List, Math, Reservoir Sampling)  
> **LeetCode:** [Problem Link](https://leetcode.com/problems/linked-list-random-node/)  
> **Status:** Solved ✅

## 🧠 Problem Overview

Given a singly linked list, implement a solution to randomly return a node’s value — **every node should have the same probability** of being chosen.

### 🔧 Class Design

```python
class Solution:
    def __init__(self, head: ListNode):
        # your code here

    def getRandom(self) -> int:
        # your code here


Input:
["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
[[[1, 2, 3]], [], [], [], [], []]

Output:
[null, 1, 3, 2, 2, 3]
