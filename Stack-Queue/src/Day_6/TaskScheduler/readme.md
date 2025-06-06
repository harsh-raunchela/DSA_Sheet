# 🧠 Leetcode 621: Task Scheduler

**Difficulty:** Medium  
**Tags:** Greedy, Heap (Priority Queue), Simulation  
**Status:** ✅ Solved

---

## 📄 Problem Statement

You are given an array of CPU tasks, each represented by a capital letter from `'A'` to `'Z'`, and a non-negative integer `n` representing the **cooldown interval**.

Each task takes exactly **1 interval** to complete.  
A **cooldown of `n`** means you can't execute the same task again until at least `n` intervals have passed.

Return the **minimum number of CPU intervals** required to complete all the tasks, including idle intervals if necessary.

---

## 🧪 Examples

### Example 1
Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation: A → B → idle → A → B → idle → A → B


### Example 2
Input: tasks = ["A","C","A","B","D","B"], n = 1
Output: 6
Explanation: A → B → C → D → A → B


### Example 3
Input: tasks = ["A","A","A","B","B","B"], n = 3
Output: 10
Explanation: A → B → idle → idle → A → B → idle → idle → A → B