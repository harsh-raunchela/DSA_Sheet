# 🌳 Maximum Path Sum from Any Node

> **Difficulty**: Medium  
> **Accuracy**: 42.92%  
> **Submissions**: 100K+  
> **Points**: 4  
> **Average Time to Solve**: 45 minutes

## 🧠 Problem Statement

Given a **binary tree**, find the **maximum path sum**.  
A **path** is defined as any sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them.  
The path **does not need to pass through the root** and **can start and end at any node**.

---

## 🔍 Examples

### Example 1:
**Input**:  
`root[] = [10, 2, 10, 20, 1, N, -25, N, N, N, N, 3, 4]`

**Output**:  
`42`

**Explanation**:  
The path with maximum sum is:  
`20 → 2 → 10 → 10`  
and it gives a sum of `20 + 2 + 10 + 10 = 42`.

---

### Example 2:
**Input**:  
`root[] = [-17, 11, 4, 20, -2, 10]`

**Output**:  
`31`

**Explanation**:  
The path with maximum sum is:  
`20 → 11 → 0`, giving a sum of `31`.

---

## ✅ Constraints

- `1 ≤ number of nodes ≤ 10^3`
- `-10^4 ≤ node.data ≤ 10^4`

---