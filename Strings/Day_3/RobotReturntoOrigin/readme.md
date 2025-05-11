# 🤖 LeetCode 657 - Robot Return to Origin

## 📝 Problem Statement

You're given a string `moves` representing a series of moves on a 2D plane. The robot starts at the origin (0, 0). Each move in the string moves the robot one unit:

- `'R'` = right (+1 on x-axis)
- `'L'` = left (-1 on x-axis)
- `'U'` = up (+1 on y-axis)
- `'D'` = down (-1 on y-axis)

**Return `true` if the robot returns to the origin after all moves; otherwise, return `false`.**

---

## 📥 Input

- `moves`: A string of characters (`'U'`, `'D'`, `'L'`, `'R'`)

## 📤 Output

- A boolean: `true` if the robot is back at (0, 0), else `false`.

---

## 🧠 Examples

### Example 1
**Input:**
```python
moves = "UD"
Output:

True
Explanation:
The robot goes up and then down. It ends up back at the origin.

Example 2
Input:

moves = "LL"

Output:

False
Explanation:
It moves two steps left and doesn't return to the origin.