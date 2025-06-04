# Asteroid Collision - LeetCode #735

## Problem Overview

You’re given an array of integers representing asteroids floating in space. Each asteroid moves either left or right:

- Positive number → asteroid moving **right**
- Negative number → asteroid moving **left**
- Absolute value → size of the asteroid

When two asteroids moving towards each other collide, the smaller one explodes. If they’re the same size, **both explode**. Asteroids moving in the same direction never collide.

Your job? Return the state of the asteroids after all collisions.

---

## Example

```java
Input:  [5, 10, -5]
Output: [5, 10]

Input:  [8, -8]
Output: []

Input:  [10, 2, -5]
Output: [10]