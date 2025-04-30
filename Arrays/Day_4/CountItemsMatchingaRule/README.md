# ✅ 1773. Count Items Matching a Rule

**Difficulty:** Easy  
**Tag(s):** Array, String

---

## 🧠 Problem Statement

You're given an array `items`, where each `items[i] = [typei, colori, namei]` describes the **type**, **color**, and **name** of the i-th item.

You are also given two strings:
- `ruleKey` → one of `"type"`, `"color"`, or `"name"`
- `ruleValue` → the value to match

An item is said to **match the rule** if the field specified by `ruleKey` is equal to `ruleValue`.

Return the **number of items** that match the given rule.

---

## 📥 Input

- `items` → List of lists of strings `[[type, color, name], ...]`
- `ruleKey` → a string: `"type"`, `"color"`, or `"name"`
- `ruleValue` → a string to match against the chosen key

---

## 📤 Output

- An integer representing the number of items that match the rule

---

## 🔍 Examples

### Example 1:
```text
Input: 
items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
ruleKey = "color",
ruleValue = "silver"

Output: 1

Explanation: Only ["computer","silver","lenovo"] matches the color rule.

Example 2: 

Input: 
items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
ruleKey = "type",
ruleValue = "phone"

Output: 2

Explanation: The first and third items have type "phone".
