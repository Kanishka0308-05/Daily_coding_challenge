# Day 34 - LeetCode Challenge

## 📌 Problems Solved

### 1. Count Complete Tree Nodes (Medium)
**LeetCode 222**

#### Problem Statement
Given the root of a complete binary tree, return the number of nodes in the tree.

#### Approach
- Compute the height of the leftmost path and the rightmost path.
- If both heights are equal, the tree is a perfect binary tree.
- Calculate the number of nodes directly using the formula `(2^height) - 1`.
- Otherwise, recursively count the nodes in the left and right subtrees.

#### Concepts Used
- Complete Binary Tree
- Binary Trees
- Recursion
- Divide and Conquer

#### Time Complexity
- **O(log² n)**

#### Space Complexity
- **O(log n)** *(Recursive call stack)*

---

### 2. Lowest Common Ancestor of a Binary Tree (Medium)
**LeetCode 236**

#### Problem Statement
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

#### Approach
- Traverse the tree recursively.
- If the current node is `null`, `p`, or `q`, return it.
- Search for both nodes in the left and right subtrees.
- If both recursive calls return non-null values, the current node is the LCA.
- Otherwise, return the non-null result.

#### Concepts Used
- Binary Trees
- Depth-First Search (DFS)
- Recursion
- Divide and Conquer

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(h)** *(Recursive call stack, where h is the height of the tree)*
