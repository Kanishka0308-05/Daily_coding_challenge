# Day 25 - Linked List

## Problems Solved

### 1. Remove Nth Node From End of List (LeetCode 19)

#### Problem Statement
Given the head of a linked list, remove the **nth node from the end** of the list and return the updated linked list.

#### Approach
- Create a dummy node before the head.
- Initialize two pointers, `fast` and `slow`, at the dummy node.
- Move the `fast` pointer `n + 1` steps ahead.
- Move both pointers together until `fast` reaches the end.
- The `slow` pointer will be just before the node to be removed.
- Delete the target node by updating the pointers.
- Return the modified list.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

---

### 2. Remove Duplicates from Sorted List II (LeetCode 82)

#### Problem Statement
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

#### Approach
- Create a dummy node before the head.
- Use a `prev` pointer to track the last unique node.
- Traverse the linked list.
- If consecutive nodes have the same value, skip all nodes with that value.
- Otherwise, move the `prev` pointer forward.
- Return the updated linked list.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`
