# Day 11 - Matrix Problems

This folder contains Java solutions for two popular matrix problems from LeetCode.

---

## 1. Valid Sudoku



### Approach
- Use three boolean arrays to track the digits present in:
    - Each row
    - Each column
    - Each 3×3 sub-box
- Traverse every cell:
    - Skip empty cells.
    - Compute the corresponding box index.
    - If the digit has already appeared in the same row, column, or box, return `false`.
    - Otherwise, mark the digit as seen.
- If the traversal completes without conflicts, return `true`.

### Complexity
- **Time Complexity:** `O(81)` ≈ `O(1)`
- **Space Complexity:** `O(1)`



---

## 2. Spiral Matrix


### Approach
Maintain four boundaries:

- `top`
- `bottom`
- `left`
- `right`

Traverse the matrix layer by layer:

1. Left → Right
2. Top → Bottom
3. Right → Left
4. Bottom → Top

After each traversal, update the corresponding boundary. Continue until all elements have been visited.

### Complexity
- **Time Complexity:** `O(m × n)`
- **Space Complexity:** `O(1)` *(excluding the output list)*

---

