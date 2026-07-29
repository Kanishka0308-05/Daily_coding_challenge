# Day 32 - LeetCode Challenge

## 📌 Problems Solved

### 1. Binary Tree Maximum Path Sum (Hard)
**LeetCode 124**

#### Problem Statement
Given the root of a binary tree, return the maximum path sum of any non-empty path. A path can start and end at any node in the tree.

#### Approach
- Perform a postorder DFS traversal.
- Compute the maximum gain from the left and right subtrees.
- Ignore negative gains by treating them as `0`.
- Update the global maximum using the sum of the current node and both subtree gains.
- Return the maximum gain contributed by one subtree to the parent.

#### Concepts Used
- Binary Trees
- Depth-First Search (DFS)
- Recursion
- Dynamic Programming on Trees

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(h)** *(Recursive call stack, where h is the height of the tree)*
