# 🧠 1669. Merge In Between Linked Lists

## 📋 Problem Statement

You are given **two singly linked lists**:

- `list1` of size `n`
- `list2` of size `m`

Your task is to **remove nodes from `list1` starting at index `a` through index `b`** (inclusive), and then **insert the entire `list2` in their place**.

The goal is to return the **head of the newly merged list**.

---

## 📊 Example 1

**Input:**
list1 = [10,1,13,6,9,5]
a = 3
b = 4
list2 = [1000000,1000001,1000002]


**Output:**
[10,1,13,1000000,1000001,1000002,5]


**Explanation:**
We chop out `list1[3]` to `list1[4]` (i.e., nodes with values 6 and 9), and plug in all of `list2`.

---

## 📊 Example 2

**Input:**
list1 = [0,1,2,3,4,5,6]
a = 2
b = 5
list2 = [1000000,1000001,1000002,1000003,1000004]


**Output:**
[0,1,1000000,1000001,1000002,1000003,1000004,6]


**Explanation:**
Nodes from index 2 to 5 (values 2 to 5) are replaced by `list2`.

---