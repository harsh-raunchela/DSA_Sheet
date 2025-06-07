# 32. Longest Valid Parentheses 🧩

> **Difficulty**: Hard  
> **Tags**: Stack, Dynamic Programming, Two Pointers  
> **Platform**: LeetCode  
> **Status**: ✅ Solved

---

## 📝 Problem Statement

Given a string containing just the characters `'('` and `')'`, return the **length of the longest valid (well-formed) parentheses substring**.

---

## 📥 Input

- A string `s` where `0 <= s.length <= 3 * 10⁴`
- All characters in `s` are either `'('` or `')'`

---

## 📤 Output

- An integer representing the **length** of the longest valid parentheses substring.

---

## 💡 Examples

### Example 1:
Input: s = "(()"
Output: 2
Explanation: The longest valid substring is "()"



### Example 2:
Input: s = ")()())"
Output: 4
Explanation: The longest valid substring is "()()"


### Example 3:
Input: s = ""
Output: 0