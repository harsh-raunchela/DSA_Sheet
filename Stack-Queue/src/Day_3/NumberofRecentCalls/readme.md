# 933. Number of Recent Calls

**Difficulty:** Easy  
**Tags:** Queue, Sliding Window, Data Structures  
**Problem Link:** [LeetCode - 933](https://leetcode.com/problems/number-of-recent-calls/)

---

## 🧠 Problem Summary

You're building a `RecentCounter` class that counts the number of recent requests (aka pings) made within the last **3000 milliseconds**.

Each ping has a timestamp `t`, and you're guaranteed that pings are received in **strictly increasing** time order.

---

## 🔧 Class Design

### `RecentCounter()`
- Initializes a new instance of the counter.

### `int ping(int t)`
- Adds a new ping at time `t`.
- Returns the number of pings that have occurred in the time interval `[t - 3000, t]`.

---

## 🧪 Example

```java
Input:
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]

Output:
[null, 1, 2, 3, 3]

Explanation:
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // return 1 (requests = [1])
recentCounter.ping(100);   // return 2 (requests = [1, 100])
recentCounter.ping(3001);  // return 3 (requests = [1, 100, 3001])
recentCounter.ping(3002);  // return 3 (requests = [100, 3001, 3002])