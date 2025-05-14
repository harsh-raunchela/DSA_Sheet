# 686. Repeated String Match

## 🧩 Problem Statement

Given two strings `a` and `b`, return the **minimum number of times** you should **repeat** string `a` so that `b` becomes a **substring** of the repeated string.  
If it is **impossible**, return `-1`.

> Note:  
> Repeating `"abc"` 0 times is `""`  
> Repeating once is `"abc"`  
> Repeating twice is `"abcabc"`

---

## 🧠 Examples

### Example 1:
Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: "abcd" repeated 3 times = "abcdabcdabcd" contains "cdabcdab"



### Example 2:
Input: a = "a", b = "aa"
Output: 2
Explanation: "a" repeated 2 times = "aa" which contains "aa"


### Example 3:
Input: a = "abc", b = "cabcabca"
Output: 4
Explanation: "abcabcabcabc" contains "cabcabca"