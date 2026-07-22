# Day 29 - LeetCode Challenge

## 📌 Problems Solved

### 1. Construct Binary Tree from Preorder and Inorder Traversal (Medium)
**LeetCode 105**

#### Problem Statement
Given two integer arrays `preorder` and `inorder`, construct and return the binary tree.

#### Approach
- The first element in the preorder traversal is always the root.
- Locate the root in the inorder traversal.
- Elements on the left side belong to the left subtree.
- Elements on the right side belong to the right subtree.
- Recursively build the left and right subtrees.



#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(n)**

---

### 2. Construct Binary Tree from Inorder and Postorder Traversal (Medium)
**LeetCode 106**

#### Problem Statement
Given two integer arrays `inorder` and `postorder`, construct and return the binary tree.

#### Approach
- The last element in the postorder traversal is always the root.
- Locate the root in the inorder traversal.
- Elements on the left side belong to the left subtree.
- Elements on the right side belong to the right subtree.
- Since we process postorder from the end, build the right subtree before the left subtree.


#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(n)**

