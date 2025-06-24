# 🔥 Burning Tree

### 🧠 Difficulty: Hard
**Accuracy:** 53.53%  
**Submissions:** 117K+  
**Points:** 8

---

## 📝 Problem Statement

Given a binary tree and a **target node**, determine the **minimum time** required to **burn the entire tree** if the target node is set on fire.

At each second, the fire spreads to:
- 🔽 Left child
- 🔼 Parent
- 🔽 Right child

> All node values are **unique**.

---

## 🧪 Examples

### Example 1
Input: root[] = [1, 2, 3, 4, 5, 6, 7], target = 2
Output: 3

**Explanation**
- Time 0: 2 🔥
- Time 1: 1, 4, 5
- Time 2: 3
- Time 3: 6, 7

---

### Example 2
Input: root[] = [1, 2, 3, 4, 5, N, 7, 8, N, 10], target = 10
Output: 5

**Explanation**
- Time 0: 10 🔥
- Time 1: 5
- Time 2: 2
- Time 3: 1, 4
- Time 4: 3, 8
- Time 5: 7

---

## ✅ Constraints

- `1 ≤ number of nodes ≤ 10^5`
- `1 ≤ node->data ≤ 10^5`

---
