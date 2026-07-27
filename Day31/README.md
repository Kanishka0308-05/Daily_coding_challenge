# Day 31 - LeetCode Challenge

## 📌 Problems Solved

### 1. Path Sum (Easy)
**LeetCode 112**

#### Problem Statement
Given the root of a binary tree and an integer `targetSum`, determine whether the tree has a root-to-leaf path such that adding up all the values along the path equals `targetSum`.

#### Approach
- Traverse the tree recursively.
- Subtract each node's value from the target sum.
- When a leaf node is reached, check whether the remaining target equals the node's value.
- Return `true` if any valid path exists.

#### Concepts Used
- Binary Trees
- Recursion
- Depth-First Search (DFS)

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(h)**

---

### 2. Sum Root to Leaf Numbers (Medium)
**LeetCode 129**

#### Problem Statement
Given the root of a binary tree containing digits from `0` to `9`, each root-to-leaf path represents a number. Return the total sum of all root-to-leaf numbers.

#### Approach
- Perform a DFS traversal.
- Build the current number by multiplying the previous value by 10 and adding the current node's digit.
- When a leaf node is reached, return the formed number.
- Sum the values returned by the left and right subtrees.

#### Concepts Used
- Binary Trees
- Depth-First Search (DFS)
- Recursion
- Tree Traversal

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(h)**
