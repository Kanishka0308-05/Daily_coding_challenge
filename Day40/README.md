# Day 40 - LeetCode Challenge

## 📌 Problems Solved

### 1. Clone Graph (Medium)
**LeetCode 133**

#### Problem Statement
Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.

#### Approach
- Traverse the graph using DFS.
- Maintain a HashMap to map each original node to its cloned node.
- If a node has already been cloned, return the existing clone.
- Otherwise, create a new node and recursively clone all its neighbors.

#### Concepts Used
- Graphs
- Depth-First Search (DFS)
- HashMap
- Graph Cloning

#### Time Complexity
- **O(V + E)**

#### Space Complexity
- **O(V)**

---

### 2. Evaluate Division (Medium)
**LeetCode 399**

#### Problem Statement
You are given equations representing division relationships between variables. For each query, determine the result of the division if possible.

#### Approach
- Represent variables as graph nodes.
- Store division values as weighted edges.
- For every query, perform DFS to find a path between the two variables.
- Multiply edge weights along the path to compute the answer.
- Return `-1.0` if no valid path exists.

#### Concepts Used
- Graphs
- Weighted Graph
- Depth-First Search (DFS)
- HashMap
- Graph Traversal

#### Time Complexity
- **O(E + Q × (V + E))**

#### Space Complexity
- **O(V + E)**
