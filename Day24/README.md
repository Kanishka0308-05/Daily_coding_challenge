# Day 24 - Reverse Linked List Problems

## 1. Reverse Linked List II

### Problem Statement
Given the head of a singly linked list and two integers `left` and `right`, reverse the nodes of the list from position `left` to position `right` and return the modified list.

### Example

**Input**
```text
head = [1,2,3,4,5], left = 2, right = 4
```

**Output**
```text
[1,4,3,2,5]
```

### Approach

- Create a dummy node before the head.
- Move a pointer to the node just before position `left`.
- Reverse the nodes between `left` and `right`.
- Reconnect the reversed part with the remaining list.
- Return the new head.


### Time Complexity

- **O(n)**

### Space Complexity

- **O(1)**




---

## 2. Reverse Nodes in k-Group

### Problem Statement

Given the head of a linked list, reverse the nodes of the list `k` at a time and return the modified list.

If the number of nodes is not a multiple of `k`, then the remaining nodes at the end should remain unchanged.

### Example

**Input**
```text
head = [1,2,3,4,5], k = 2
```

**Output**
```text
[2,1,4,3,5]
```

### Approach

- Process the linked list in groups of size `k`.
- Check whether a complete group exists.
- Reverse the current group.
- Connect the reversed group with the rest of the list.
- Continue until fewer than `k` nodes remain.



### Time Complexity

- **O(n)**

### Space Complexity

- **O(1)**


