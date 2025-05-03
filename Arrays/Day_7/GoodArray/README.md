# LeetCode Problem 1250 — Check If It Is a Good Array

**Difficulty:** Hard  
**Topics:** Math, Number Theory, GCD

---

## 🧠 Problem Statement

You are given an array `nums` of **positive integers**.

Your task is to determine whether the array is **"good"**, meaning:

> You can pick any subset of numbers, multiply them by any integers (positive, negative, or zero), and **add** them up to get exactly **1**.

---

## ✅ Return

- `True` if the array is good.
- `False` otherwise.

---

## 🔍 Examples

### Example 1:
Input: nums = [12, 5, 7, 23]

Output: true

Explanation:
53 + 7(-2) = 1


### Example 2:
Input: nums = [29, 6, 10]

Output: true

Explanation:
291 + 6(-3) + 10*(-1) = 1


### Example 3:
Input: nums = [3, 6]

Output: false