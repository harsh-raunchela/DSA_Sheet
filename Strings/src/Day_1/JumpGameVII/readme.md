# LeetCode 1871 – Jump Game VII

**Difficulty:** Medium  
**Topics:** Dynamic Programming, Sliding Window, Greedy, BFS  
**Companies:** Amazon, Google, Microsoft

---

## 🧠 Problem Statement

You are given a binary string `s`, and two integers `minJump` and `maxJump`.  
You start at index `0`, and your goal is to reach the last index of the string.

### You can jump from index `i` to index `j` if:
- `i + minJump <= j <= min(i + maxJump, len(s) - 1)`
- `s[j] == '0'`

Return `true` if you can reach the **last index**, otherwise `false`.

---

## ✅ Examples

### Example 1:

```text
Input: 
s = "011010", minJump = 2, maxJump = 3

Output: true

Explanation:
- Start at index 0.
- Jump to index 3 (valid since 0 + 2 ≤ 3 ≤ 0 + 3 and s[3] == '0')
- Then jump to index 5 (3 + 2 ≤ 5 ≤ 3 + 3 and s[5] == '0')
- We reached the last index!

EXAMPLE 2:

Input: 
s = "01101110", minJump = 2, maxJump = 3

Output: false

Explanation:
- You get stuck after some jumps and can't reach the end safely.

