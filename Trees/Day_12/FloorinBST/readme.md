

# Floor in a Binary Search Tree (BST)

**Difficulty**: Medium  
**Accuracy**: 51.06%
**Submissions**: 109K+
**Points**: 4
**Average Time**: 20 mins

---

        ## 🧠 Problem Statement

You are given a **Binary Search Tree (BST)** with `n` nodes and a target value `x`. Your task is to find the **greatest value node in the BST which is smaller than or equal to `x`**.

        > 📌 Note: If `x` is smaller than the smallest node in the BST, return `-1`.

        ---

        ## 📥 Input Format

- An integer `n` representing the number of nodes in the BST.
  - The structure of the BST.
- An integer `x` whose floor value is to be found.

---

        ## 📤 Output Format

- Return a single integer — the floor of `x` in the BST.

---

        ## 💡 Examples

### Example 1:
Input:
n = 7
BST Structure:
2

        81
        /
        42 87
        \
        66 90
        /
        45

x = 87

Output:
87

yaml
Copy code
**Explanation**: 87 exists in the tree, so the floor is 87.

        ---

        ### Example 2:
Input:
n = 4
BST Structure:
6

        8
        /
        7 9

x = 11

Output:
9

yaml
Copy code
**Explanation**: No node with value 11, but the largest value ≤ 11 is 9.

        ---

        ### Example 3:
Input:
n = 4
BST Structure:
6

        8
        /
        7 9

x = 5

Output:
-1

yaml
Copy code
**Explanation**: All nodes in the BST are greater than 5.

        ---

        ## ✅ Constraints

- `1 <= Node data <= 10^9`
  - `1 <= n <= 10^5`

