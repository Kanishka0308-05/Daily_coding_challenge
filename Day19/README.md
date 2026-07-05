# 📅 Day 19

Today I solved two classic stack-based problems that focus on validating expressions and simplifying file system paths. These problems helped strengthen my understanding of stack operations, parsing strings, and handling edge cases.

## ✅ Problems Solved

### 1. Valid Parentheses (Easy)


- **Key Learning:**
    - Used a stack to keep track of opening brackets.
    - Verified that every closing bracket matches the most recent opening bracket.
    - Ensured the stack is empty after processing the entire string.

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

### 2. Simplify Path (Medium)


- **Key Learning:**
    - Ignored `"."` (current directory).
    - Removed the previous directory when encountering `".."`.
    - Skipped multiple consecutive slashes.
    - Reconstructed the canonical Unix path from the stack.

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

