# 🔁 Circular Queue (Ring Buffer) – LeetCode Problem #22

## 🚀 Overview

This project is a custom implementation of a **Circular Queue**, also known as a **Ring Buffer**. It's a linear data structure that wraps around — making use of empty slots efficiently through a circular approach. All operations follow the **FIFO** (First In, First Out) principle.

A circular queue solves a key limitation of regular queues: in a normal queue, once it's full, we can't insert more even if there’s space in front (due to deletions). Circular queues fix that — making them super useful in systems like task schedulers, streaming buffers, and OS-level job queues.

---

## 🛠️ Features

Here’s what this queue can do:

- `MyCircularQueue(k)`: Initializes the queue with size `k`.
- `enQueue(value)`: Adds a value to the rear. Returns `true` if successful.
- `deQueue()`: Removes a value from the front. Returns `true` if successful.
- `Front()`: Returns the front element or `-1` if the queue is empty.
- `Rear()`: Returns the last element or `-1` if the queue is empty.
- `isEmpty()`: Checks if the queue is empty.
- `isFull()`: Checks if the queue is full.

No built-in queue classes are used — it’s all coded from scratch 💪.

---

## 💡 Why Circular Queue?

> "When you gotta loop, you loop smart."

### Regular Queue vs Circular Queue
| Feature          | Regular Queue       | Circular Queue       |
|------------------|---------------------|-----------------------|
| Fixed size?      | Yes                 | Yes                   |
| Reuse space?     | ❌ No               | ✅ Yes                |
| Efficient memory | ❌ Often wasted     | ✅ Fully utilized     |

---

## 🧪 Example Walkthrough

```js
Input:
["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
[[3], [1], [2], [3], [4], [], [], [], [4], []]

Output:
[null, true, true, true, false, 3, true, true, true, 4]