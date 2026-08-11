# Day 42 - LeetCode Challenge

## 📌 Problems Solved

### 1. Snakes and Ladders (Medium)
**LeetCode 909**

#### Problem Statement
Given an `n x n` board representing a Snakes and Ladders game, determine the minimum number of dice rolls required to reach the final square.

Each dice roll can move the player from `1` to `6` squares. If the player lands on the start of a snake or ladder, they must move to its destination.

#### Approach
- Model each board square as a node in a graph.
- Use **Breadth-First Search (BFS)** because every dice roll has the same cost of one move.
- Start from square `1`.
- For every square, try all possible dice rolls from `1` to `6`.
- If the destination contains a snake or ladder, move to its destination.
- Keep track of visited squares to avoid processing the same square multiple times.
- Return the number of moves when the final square is reached.
- If the final square cannot be reached, return `-1`.

#### Important Part
The board uses alternating row directions, so a helper function is used to convert a square number into its corresponding `(row, column)` coordinates.

#### Concepts Used
- Graphs
- Breadth-First Search (BFS)
- Queue
- Shortest Path
- Matrix Traversal
- Visited Array

#### Time Complexity
- **O(n²)**

#### Space Complexity
- **O(n²)**
