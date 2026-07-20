# Day 27 - LeetCode 

Today I started the **Trees** section of the LeetCode Top Interview 150. Trees are one of the most important data structures used in coding interviews and help strengthen recursion and traversal concepts.

## Problems Solved

### 1. Maximum Depth of Binary Tree


**Approach:**
- If the node is `null`, return `0`.
- Recursively calculate the maximum depth of the left and right subtrees.
- Return `1 + max(leftDepth, rightDepth)`.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(h)` (Recursive stack, where `h` is the height of the tree)

---

### 2. Same Tree


**Approach:**
- If both nodes are `null`, return `true`.
- If one node is `null` or values differ, return `false`.
- Recursively compare the left and right subtrees.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(h)`
