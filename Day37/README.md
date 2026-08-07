# Day 37 - LeetCode Challenge

## 📌 Problems Solved

### 1. Minimum Absolute Difference in BST (Easy)
**LeetCode 530**

#### Problem Statement
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes.

#### Approach
- Perform an inorder traversal of the BST.
- Since inorder traversal of a BST produces values in sorted order, compare each node with the previously visited node.
- Update the minimum difference whenever a smaller difference is found.

#### Concepts Used
- Binary Search Tree (BST)
- Inorder Traversal
- Depth-First Search (DFS)
- Recursion

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(h)** *(Recursive call stack)*

---

### 2. Kth Smallest Element in a BST (Medium)
**LeetCode 230**

#### Problem Statement
Given the root of a Binary Search Tree and an integer `k`, return the `k`th smallest value among all the node values.

#### Approach
- Perform an inorder traversal of the BST.
- Count the nodes as they are visited.
- When the count reaches `k`, store and return the current node's value.

#### Concepts Used
- Binary Search Tree (BST)
- Inorder Traversal
- Depth-First Search (DFS)
- Recursion

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(h)** *(Recursive call stack)*

---

### 3. Validate Binary Search Tree (Medium)
**LeetCode 98**

#### Problem Statement
Given the root of a binary tree, determine whether it is a valid Binary Search Tree (BST).

#### Approach
- Recursively validate each node using a valid value range.
- Every node must satisfy:
    - All values in the left subtree are smaller.
    - All values in the right subtree are greater.
- Update the valid range while traversing the tree.

#### Concepts Used
- Binary Search Tree (BST)
- Depth-First Search (DFS)
- Recursion
- Tree Validation

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(h)** *(Recursive call stack)*

