# ⌨️ LeetCode 925 - Long Pressed Name

## 📝 Problem Statement

Your friend is typing their name into a keyboard. Sometimes, when typing a character `c`, the key might get long pressed — meaning the character is typed **1 or more times**.

You're given two strings:
- `name`: the intended name to type.
- `typed`: the actual result from the keyboard.

🔁 **Return `true`** if `typed` could be a result of long pressing characters in `name`. Otherwise, return `false`.

---

## 📥 Input

- `name` and `typed` consist only of lowercase English letters.
- `1 <= name.length, typed.length <= 1000`

## 📤 Output

- Boolean: `True` if `typed` is a valid long-pressed version of `name`, else `False`.

---

## 🧠 Examples

### Example 1

**Input:**
```python
name = "alex"
typed = "aaleex"

OUTPUT:

True


Example 2

Input:

name = "saeed"
typed = "ssaaedd"

OUTPUT:

FALSE