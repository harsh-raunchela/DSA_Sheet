# 📋 LeetCode 1773 - Count Items Matching a Rule

## 🧩 Problem Statement

You are given an array `items`, where each element is a list containing 3 strings: `[typei, colori, namei]`.

You're also given:
- A string `ruleKey`, which can be `"type"`, `"color"`, or `"name"`.
- A string `ruleValue`.

Your task is to **return the number of items** that match the given rule:
- `ruleKey == "type"` ➜ check if `typei == ruleValue`
- `ruleKey == "color"` ➜ check if `colori == ruleValue`
- `ruleKey == "name"` ➜ check if `namei == ruleValue`

---

## 🧠 Examples

### Example 1
**Input:**
```text
items = [["phone","blue","pixel"],
         ["computer","silver","lenovo"],
         ["phone","gold","iphone"]]
ruleKey = "color"
ruleValue = "silver"

Output: 1
Explanation: Only the second item matches the rule.

EXAMPLE 2:
items = [["phone","blue","pixel"],
         ["computer","silver","phone"],
         ["phone","gold","iphone"]]
ruleKey = "type"
ruleValue = "phone"

Output: 2
Explanation: The first and third items match.