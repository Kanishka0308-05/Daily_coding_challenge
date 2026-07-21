# Day 28 - LeetCode Challenge

## 📌 Problems Solved

### 1. Invert Binary Tree (Easy)
**LeetCode 226**

#### Problem Statement
Given the root of a binary tree, invert the tree and return its root.

#### Approach
- Traverse the tree recursively.
- Swap the left and right child of each node.
- Continue the process for all nodes.

#### Concepts Used
- Binary Trees
- Recursion
- DFS (Depth-First Search)

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(h)** (Recursive call stack)

---

### 2. Symmetric Tree (Easy)
**LeetCode 101**

#### Problem Statement
Given the root of a binary tree, check whether it is symmetric around its center.

#### Approach
- Compare the left and right subtrees recursively.
- Two trees are mirrors if:
    - Their root values are equal.
    - Left subtree of one matches the right subtree of the other.
    - Right subtree of one matches the left subtree of the other.

#### Concepts Used
- Binary Trees
- Recursion
- DFS
- Tree Traversal

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(h)** (Recursive call stack)
