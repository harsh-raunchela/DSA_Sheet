# 🧩 1670. Design Front Middle Back Queue

## 🚀 Problem Statement

Design a data structure that supports **push** and **pop** operations from the **front**, **middle**, and **back** of a queue.

---

## 📘 Class API

```java
FrontMiddleBackQueue() 
// Initializes the queue

void pushFront(int val) 
// Adds val to the front of the queue

void pushMiddle(int val) 
// Adds val to the middle of the queue

void pushBack(int val) 
// Adds val to the back of the queue

int popFront() 
// Removes and returns the front element; if empty, returns -1

int popMiddle() 
// Removes and returns the middle element (frontmost if two); if empty, returns -1

int popBack() 
// Removes and returns the back element; if empty, returns -1
⚠️ Middle Element Rule
When inserting: if there are two middle positions, insert before the center.

When removing: if there are two middle elements, remove the frontmost one.

🧠 Example

FrontMiddleBackQueue q = new FrontMiddleBackQueue();
q.pushFront(1);   // [1]
q.pushBack(2);    // [1, 2]
q.pushMiddle(3);  // [1, 3, 2]
q.pushMiddle(4);  // [1, 4, 3, 2]
q.popFront();     // 1 -> [4, 3, 2]
q.popMiddle();    // 3 -> [4, 2]
q.popMiddle();    // 4 -> [2]
q.popBack();      // 2 -> []
q.popFront();     // -1