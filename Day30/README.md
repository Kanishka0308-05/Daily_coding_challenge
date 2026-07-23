# Day 30 - LeetCode Challenge

## 📌 Problems Solved

### 1. Populating Next Right Pointers in Each Node II (Medium)
**LeetCode 117**

#### Problem Statement
Given a binary tree, populate each `next` pointer to point to its next right node. If there is no next right node, the `next` pointer should be set to `null`.

#### Approach
- Perform a level-order traversal (BFS) using a queue.
- Process one level at a time.
- Connect each node's `next` pointer to the next node in the current level.
- The last node of every level points to `null`.



#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(n)**

---

### 2. Flatten Binary Tree to Linked List (Medium)
**LeetCode 114**

#### Problem Statement
Given the root of a binary tree, flatten the tree into a linked list in-place following the preorder traversal.

#### Approach
- Traverse the tree in reverse preorder (Right → Left → Root).
- Maintain a pointer to the previously processed node.
- Set the current node's `right` pointer to the previous node.
- Set the `left` pointer to `null`.
- Continue recursively until the tree is flattened.



#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(h)** *(Recursive call stack, where h is the height of the tree)*
