# 🧬 138. Copy List with Random Pointer

**Difficulty:** Medium  
**Topics:** Linked List, HashMap  
**Companies:** Amazon, Google, Microsoft, Bloomberg

---

## 🧠 Problem Statement

You're given a linked list where each node has:
- `val` (integer)
- `next` pointer (standard)
- `random` pointer that can point to **any node** in the list (or be `null`)

Your task:  
**Return a deep copy** of this list. Each new node must:
- Be a brand new instance
- Have the same `val`
- Have correctly matched `next` and `random` pointers
- No pointer in the new list should link to any old node ❌

---

## 🔁 Input Representation

The linked list is passed as a list of nodes like:

```python
[[7,null],[13,0],[11,4],[10,2],[1,0]]
Here:

Each element is [val, random_index]

random_index means which node that node's .random pointer points to

🧪 Examples
Example 1:

Input:  head = [[7,null],[13,0],[11,4],[10,2],[1,0]]

Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]


Example 2:


Input:  head = [[1,1],[2,1]]

Output: [[1,1],[2,1]]