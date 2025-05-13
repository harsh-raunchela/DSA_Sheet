# ✅ LeetCode 13 - Roman to Integer

## 📝 Problem Statement

Roman numerals are made up of 7 symbols:

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

Roman numerals are usually written from **largest to smallest**, left to right.  
However, there are **six special cases** where a smaller number appears before a larger one to indicate subtraction:

- `IV = 4`, `IX = 9`
- `XL = 40`, `XC = 90`
- `CD = 400`, `CM = 900`

Your task is to **convert a Roman numeral string `s` into its integer value**.

---

## 💡 Examples

### Example 1:
**Input:**
```python

s = "III"

Output: 3

Example 2:

Input:

s = "LVIII"

Output: 58

Explanation: L = 50, V = 5, III = 3 → 50 + 5 + 3 = 58

