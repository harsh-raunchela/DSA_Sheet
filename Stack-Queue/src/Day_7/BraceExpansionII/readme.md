# 🧩 Leetcode 1096 - Brace Expansion II

> **Difficulty**: Hard  
> **Tags**: Parsing, Backtracking, Recursion, Stack, Set

---

## 📝 Problem Statement

Under a custom grammar, an expression represents a set of lowercase words. Let `R(expr)` denote the set of words the expression represents.

### Grammar Rules

1. **Single characters** are singleton sets:
    - `R("a") = {"a"}`, `R("w") = {"w"}`

2. **Comma-separated `{}` means union**:
    - `R("{a,b,c}") = {"a","b","c"}`
    - `R("{{a,b},{b,c}}") = {"a","b","c"}`

3. **Concatenation of expressions (implicit)** means Cartesian product:
    - `R("{a,b}{c,d}") = {"ac","ad","bc","bd"}`
    - `R("a{b,c}{d,e}f{g,h}") = {"abdfg", "abdfh", "abefg", ...}`

4. **Formally**:
    - `R(x) = {x}` for every lowercase letter `x`
    - `R({e1,e2,...}) = R(e1) ∪ R(e2) ∪ ...`
    - `R(e1 + e2) = {a + b for (a, b) in R(e1) × R(e2)}`

---

## 📥 Input
- A valid expression as a `String`, with length between `1` and `60`
- Characters: `{`, `}`, `,`, lowercase letters

## 📤 Output
- A **sorted list** of **unique words** represented by the expression

---

## 📘 Examples

### Example 1
```java
Input:  "{a,b}{c,{d,e}}"
Output: ["ac","ad","ae","bc","bd","be"]
Example 2
java
Copy code
Input:  "{{a,z},a{b,c},{ab,z}}"
Output: ["a","ab","ac","z"]