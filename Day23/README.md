# Day 23 - Linked List

## Problems Solved

### 1. Merge Two Sorted Lists (Easy)

**Problem Statement**
- Merge two sorted linked lists into one sorted linked list.

### Approach
- Create a dummy node.
- Compare nodes from both lists.
- Attach the smaller node to the result.
- Append the remaining nodes after one list becomes empty.

### Time Complexity
- O(n + m)

### Space Complexity
- O(1)

### Key Learning
- Dummy node technique.
- Efficient linked list merging.
- Pointer manipulation.


---

### 2. Copy List with Random Pointer (Medium)

**Problem Statement**
- Create a deep copy of a linked list where every node has both `next` and `random` pointers.

### Approach
- Insert copied nodes between original nodes.
- Assign random pointers using the original list.
- Separate the copied list from the original list.

### Time Complexity
- O(n)

### Space Complexity
- O(1)

### Key Learning
- Deep copy of linked lists.
- Handling random pointers.
- In-place node manipulation without extra HashMap.
