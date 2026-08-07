# Day 39 - LeetCode Challenge

## 📌 Problems Solved

### 1. Surrounded Regions (Medium)
**LeetCode 130**

#### Problem Statement
Given an `m × n` board containing `'X'` and `'O'`, capture all regions surrounded by `'X'`. A region is captured by flipping all surrounded `'O'` cells into `'X'`.

#### Approach
- Perform DFS starting from all border `'O'` cells.
- Mark every border-connected `'O'` as `'#'` since they cannot be captured.
- Traverse the board:
    - Convert remaining `'O'` cells to `'X'`.
    - Restore all `'#'` cells back to `'O'`.

#### Concepts Used
- Graph Traversal
- Depth-First Search (DFS)
- Matrix Traversal
- Recursion

#### Time Complexity
- **O(m × n)**

#### Space Complexity
- **O(m × n)** *(Worst-case recursion stack)*
