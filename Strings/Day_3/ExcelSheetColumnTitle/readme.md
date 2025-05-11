# 📊 LeetCode 168 - Excel Sheet Column Title

## 📝 Problem Statement

You're given a column number, like the ones used in Excel. Return the **column title** corresponding to that number.

### Excel Mapping:

1 -> A
2 -> B
...
26 -> Z
27 -> AA
28 -> AB
...
701 -> ZY
702 -> ZZ
703 -> AAA

yaml
Copy
Edit

---

## 📥 Input

- `columnNumber`: An integer (1 ≤ columnNumber ≤ 2³¹ - 1)

## 📤 Output

- A string representing the Excel column title.

---

## 🧠 Examples

### Example 1

**Input:**

columnNumber = 1

Output:

"A"

Example 2

Input:

columnNumber = 28

Output:

"AB"

Example 3

Input:


columnNumber = 701

Output:

"ZY"