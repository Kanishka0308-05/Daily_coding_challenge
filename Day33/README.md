# Day 33 - LeetCode Challenge

## 📌 Problems Solved

### 1. Binary Search Tree Iterator (Medium)
**LeetCode 173**

#### Problem Statement
Implement the `BSTIterator` class that represents an iterator over the in-order traversal of a Binary Search Tree (BST).

The iterator should support:
- `next()` – Returns the next smallest number.
- `hasNext()` – Returns `true` if there exists a next smallest number.

#### Approach
- Use a stack to simulate an iterative inorder traversal.
- Initially, push all left descendants of the root onto the stack.
- When `next()` is called:
    - Pop the top node.
    - If the node has a right child, push all its left descendants.
- `hasNext()` returns whether the stack is non-empty.

#### Concepts Used
- Binary Search Tree (BST)
- Stack
- Iterative Inorder Traversal
- Tree Traversal

#### Time Complexity
- **Constructor:** `O(h)`
- **next():** `O(1)` amortized
- **hasNext():** `O(1)`

#### Space Complexity
- **O(h)** *(where `h` is the height of the BST)*

