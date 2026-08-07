# Day 38 - LeetCode Challenge

## 📌 Problems Solved

### 1. Number of Islands (Medium)
**LeetCode 200**

#### Problem Statement
Given an `m x n` 2D binary grid where `'1'` represents land and `'0'` represents water, return the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.

#### Approach
- Traverse every cell in the grid.
- Whenever an unvisited land cell (`'1'`) is encountered, increment the island count.
- Perform a Depth-First Search (DFS) to visit all connected land cells.
- Mark each visited land cell as water (`'0'`) to avoid revisiting it.
- Continue until all cells have been processed.

#### Concepts Used
- Graph Traversal
- Depth-First Search (DFS)
- Matrix Traversal
- Recursion

#### Time Complexity
- **O(m × n)**

#### Space Complexity
- **O(m × n)** *(Worst-case recursion stack)*
