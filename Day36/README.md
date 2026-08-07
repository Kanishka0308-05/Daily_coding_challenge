# Day 36 - LeetCode Challenge

## 📌 Problems Solved

### 1. Binary Tree Level Order Traversal (Medium)
**LeetCode 102**

#### Problem Statement
Given the root of a binary tree, return the level order traversal of its nodes' values from left to right, level by level.

#### Approach
- Perform a Breadth-First Search (BFS) using a queue.
- Process one level of the tree at a time.
- Store the values of all nodes at the current level in a list.
- Add each level's list to the final result.

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

### 2. Binary Tree Zigzag Level Order Traversal (Medium)
**LeetCode 103**

#### Problem Statement
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values (i.e., alternate between left-to-right and right-to-left for each level).

#### Approach
- Perform a level-order traversal using a queue.
- Maintain a boolean flag to track the traversal direction.
- Insert node values at the end or beginning of the current level based on the direction.
- Toggle the direction after processing each level.

#### Concepts Used
- Binary Trees
- Breadth-First Search (BFS)
- Queue
- LinkedList
- Zigzag Traversal

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(n)**
