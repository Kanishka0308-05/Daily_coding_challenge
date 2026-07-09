# Day 21 - Linked List


### 1. Linked List Cycle (Easy)

**Problem Statement:**  
Given the `head` of a linked list, determine if the linked list has a cycle in it.

**Approach:**
- Use two pointers: `slow` and `fast`.
- Move `slow` one step at a time.
- Move `fast` two steps at a time.
- If both pointers meet, a cycle exists.
- If `fast` reaches the end, there is no cycle.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

### 2. Add Two Numbers (Medium)

**Problem Statement:**  
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each node contains a single digit. Add the two numbers and return the sum as a linked list.

**Approach:**
- Traverse both linked lists simultaneously.
- Add the corresponding digits along with the carry.
- Create a new node containing `sum % 10`.
- Update the carry as `sum / 10`.
- Continue until both lists and the carry are exhausted.

**Time Complexity:** `O(max(n, m))`  
**Space Complexity:** `O(max(n, m))`
