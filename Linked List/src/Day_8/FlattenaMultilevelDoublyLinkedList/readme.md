# 🧱 430. Flatten a Multilevel Doubly Linked List

**Difficulty:** Medium  
**Topics:** Linked List, Depth-First Search  
**Companies:** Facebook, Amazon, Microsoft

---

## 🧠 Problem Statement

You're given a **multilevel doubly linked list**. Each node contains:

- `val`: an integer
- `prev`: pointer to the previous node
- `next`: pointer to the next node
- `child`: pointer to a **child doubly linked list**, which may have its own children

Your task is to **flatten** this structure into a **single-level doubly linked list**, such that:

- All nodes appear in a linear order
- Each `child` list is inserted **immediately after its parent node**, before the original `next`
- All `child` pointers in the final list must be `null`

---

## 📥 Input Format

The linked list is serialized as an array where `null` values separate child levels. For example:

[1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]

makefile
Copy code

represents:

1 - 2 - 3 - 4 - 5 - 6
|
7 - 8 - 9 - 10
|
11 - 12

yaml
Copy code

---

## 📤 Output Format

A flattened version of the list where all `child` lists are recursively inserted between the parent node and its next.

---

## 🧪 Examples

### Example 1:

**Input:**

[1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]

**Output:**

[1,2,3,7,8,11,12,9,10,4,5,6]


### Example 2:

**Input:**

[1,2,null,3]


**Output:**

[1,3,2]


### Example 3:

**Input:**

[]


**Output:**

[]