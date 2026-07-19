# Day 26 - Linked List & Design Problems

Today I solved three important Linked List and Design problems from LeetCode. These problems strengthened my understanding of linked list manipulation, partitioning techniques, and designing efficient data structures.

---

## Problems Solved

### 1. Rotate List (Medium)


**Approach**
- Find the length of the linked list.
- Connect the last node to the head to form a circular linked list.
- Calculate the effective rotation using `k % length`.
- Move to the new tail and break the circle to obtain the rotated list.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

---

### 2. Partition List (Medium)



**Approach**
- Create two separate linked lists:
    - One containing nodes with values less than `x`.
    - Another containing nodes with values greater than or equal to `x`.
- Traverse the original list and append each node to the appropriate list.
- Join both lists while maintaining the original relative order.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

---

### 3. LRU Cache (Medium)



**Approach**
- Store key-node mappings in a HashMap for constant-time access.
- Maintain a Doubly Linked List to keep track of recently used elements.
- Move accessed nodes to the front of the list.
- Remove the least recently used node when the cache exceeds its capacity.

**Time Complexity**
- `get()` → `O(1)`
- `put()` → `O(1)`

**Space Complexity:** `O(capacity)`
