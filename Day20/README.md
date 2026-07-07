# Day 20 - Stack Problems

## 📌 Problems Solved

### 1. Min Stack (Medium)
**LeetCode #155**
### Approach
- Used two stacks:
    - One stack stores all the elements.
    - Another stack keeps track of the minimum element at every stage.
- While pushing, update the minimum stack whenever a new minimum is encountered.
- While popping, remove the top element from the minimum stack if it matches the popped value.
- This allows retrieving the minimum element in **O(1)** time.

**Time Complexity:** O(1) for all operations (`push`, `pop`, `top`, `getMin`)

**Space Complexity:** O(n)

---

### 2. Evaluate Reverse Polish Notation (Medium)
**LeetCode #150**


### Approach
- Traverse each token in the expression.
- If the token is a number, push it onto the stack.
- If it is an operator, pop the top two operands.
- Perform the corresponding operation and push the result back onto the stack.
- The remaining element in the stack is the final answer.

**Time Complexity:** O(n)

**Space Complexity:** O(n)
