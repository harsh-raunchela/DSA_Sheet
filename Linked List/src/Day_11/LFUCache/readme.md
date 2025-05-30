# 460. LFU Cache 🔁📦

**Difficulty:** Hard  
**Category:** Data Structures, Design  
**Leetcode Link:** [460. LFU Cache](https://leetcode.com/problems/lfu-cache/)

## 🧠 Problem Statement

Design and implement a **Least Frequently Used (LFU) Cache** with the following operations:

### API

```java
LFUCache(int capacity)
Initializes the LFU cache with a given capacity.


int get(int key)
Returns the value of the key if present in the cache, otherwise returns -1. Increases the usage count of the key.

void put(int key, int value)
If the key already exists, update its value and usage count.
If it does not exist:

Insert the key with usage count = 1.

If the cache reaches capacity, evict the least frequently used key.

If a tie exists in frequency, evict the least recently used key among them.

All operations must run in O(1) average time complexity.

✍️ Example

Input:
["LFUCache","put","put","get","put","get","get","put","get","get","get"]
[[2],[1,1],[2,2],[1],[3,3],[2],[3],[4,4],[1],[3],[4]]

Output:
[null,null,null,1,null,-1,3,null,-1,3,4]
Walkthrough:

// cnt(x) = usage count of x
// cache order shown = [Most Recently Used ← ... ← Least Recently Used]

LFUCache lfu = new LFUCache(2);
lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
lfu.get(1);      // returns 1, cache=[1,2], cnt(1)=2, cnt(2)=1
lfu.put(3, 3);   // evicts 2 (LFU), cache=[3,1], cnt(3)=1, cnt(1)=2
lfu.get(2);      // returns -1 (not found)
lfu.get(3);      // returns 3, cnt(3)=2
lfu.put(4, 4);   // evicts 1 (tie, LRU), cache=[4,3], cnt(4)=1, cnt(3)=2
lfu.get(1);      // returns -1
lfu.get(3);      // returns 3, cnt(3)=3
lfu.get(4);      // returns 4, cnt(4)=2