# Day 35 - LeetCode Challenge

## 📌 Problems Solved

### 1. Binary Tree Right Side View (Medium)
**LeetCode 199**

#### Problem Statement
Given the root of a binary tree, imagine yourself standing on the right side of it. Return the values of the nodes you can see from top to bottom.

#### Approach
- Perform a level-order traversal (BFS) using a queue.
- Process one level at a time.
- The last node encountered at each level is the one visible from the right side.
- Store these nodes in the result list.

#### Concepts Used
- Binary Trees
- Breadth-First Search (BFS)
- Queue
- Level Order Traversal

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(n)**

---

### 2. Average of Levels in Binary Tree (Easy)
**LeetCode 637**

#### Problem Statement
Given the root of a binary tree, return the average value of the nodes on each level as an array.

#### Approach
- Traverse the tree level by level using BFS.
- For each level:
    - Compute the sum of all node values.
    - Divide the sum by the number of nodes at that level.
- Store the average for every level in the result list.

#### Concepts Used
- Binary Trees
- Breadth-First Search (BFS)
- Queue
- Level Order Traversal

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(n)**

