# 🎯 LeetCode 1678 - Goal Parser Interpretation

## 🧩 Problem Statement

You own a **Goal Parser** that interprets a string `command`.

The command is made up of `"G"`, `"()"`, and `"(al)"` in any order.

The Goal Parser interprets the symbols as:
- `"G"` → `"G"`
- `"()"` → `"o"`
- `"(al)"` → `"al"`

Return the **final interpreted string** after parsing and concatenating the commands.

---

## 🧠 Examples

### Example 1
**Input:**  
`command = "G()(al)"`  
**Output:**  
`"Goal"`  
**Explanation:**  
`G` → `"G"`, `()` → `"o"`, `(al)` → `"al"` → `Goal`

---

### Example 2
**Input:**  
`command = "G()()()()(al)"`  
**Output:**  
`"Gooooal"`  
**Explanation:**  
Multiple `()` → `"oooo"` → `Gooooal`

---

### Example 3
**Input:**  
`command = "(al)G(al)()()G"`  
**Output:**  
`"alGalooG"`  
**Explanation:**  
Parsed in order → `"al"` + `"G"` + `"al"` + `"o"` + `"o"` + `"G"`

---

## ✅ Constraints

- `1 <= command.length <= 100`
- `command` consists only of `"G"`, `"()"`, and `"(al)"` in any order

---