# Day 41 - LeetCode Challenge

## 📌 Problems Solved

### 1. Course Schedule (Medium)
**LeetCode 207**

#### Problem Statement
There are `numCourses` courses labeled from `0` to `numCourses - 1`. Some courses have prerequisites. Determine whether it is possible to finish all courses.

#### Approach
- Represent the courses as a directed graph.
- Use **Kahn's Algorithm (BFS Topological Sort)**.
- Calculate the indegree of every course.
- Add courses with `indegree = 0` to a queue.
- Process each course and reduce the indegree of its dependent courses.
- If all courses are processed, there is no cycle and all courses can be completed.
- If some courses remain, a cycle exists.

#### Concepts Used
- Graphs
- Directed Graph
- Breadth-First Search (BFS)
- Topological Sort
- Cycle Detection
- Indegree

#### Time Complexity
- **O(V + E)**

#### Space Complexity
- **O(V + E)**

---

### 2. Course Schedule II (Medium)
**LeetCode 210**

#### Problem Statement
Given `numCourses` and a list of prerequisite pairs, return the ordering of courses that should be taken to finish all courses. If it is impossible, return an empty array.

#### Approach
- Build a directed graph using the prerequisite relationships.
- Calculate the indegree of every course.
- Add courses with no prerequisites to a queue.
- Use BFS to perform a topological sort.
- Store each processed course in the result array.
- If all courses are processed, return the ordering.
- If a cycle exists, return an empty array.

#### Concepts Used
- Graphs
- Directed Graph
- Breadth-First Search (BFS)
- Topological Sort
- Cycle Detection
- Queue
- Indegree

#### Time Complexity
- **O(V + E)**

#### Space Complexity
- **O(V + E)**
