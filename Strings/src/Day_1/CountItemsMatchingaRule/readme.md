# LeetCode 1773 – Count Items Matching a Rule

**Difficulty:** Easy  
**Topics:** Array, String, Filtering

---

## 🧠 Problem Statement

You’re given a list of items, where each item is described by:

- `type`
- `color`
- `name`

You're also given a rule in the form of a `ruleKey` and a `ruleValue`.  
Your job is to **count how many items match the given rule**.

### A rule matches if:
- `ruleKey == "type"` and `ruleValue == item[0]`, or
- `ruleKey == "color"` and `ruleValue == item[1]`, or
- `ruleKey == "name"` and `ruleValue == item[2]`

---

## ✅ Examples

### Example 1:
```text
Input: 
items = [["phone","blue","pixel"],
         ["computer","silver","lenovo"],
         ["phone","gold","iphone"]]
ruleKey = "color"
ruleValue = "silver"

Output: 1


EXAMPLE 2:

Input: 
items = [["phone","blue","pixel"],
         ["computer","silver","phone"],
         ["phone","gold","iphone"]]
ruleKey = "type"
ruleValue = "phone"

Output: 2
