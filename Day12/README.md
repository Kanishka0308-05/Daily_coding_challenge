# Day 12 - Matrix Problems

## Problems Solved

### 1. Rotate Image (Medium)


#### Approach
- Transpose the matrix.
- Reverse every row.
- The rotation is completed without using any extra matrix.

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`


---

### 2. Set Matrix Zeroes (Medium)


#### Approach
- Use the first row and first column as markers.
- Record whether the first row or first column originally contains a zero.
- Mark rows and columns that need to be zeroed.
- Update the matrix based on the markers.

**Time Complexity:** `O(m × n)`

**Space Complexity:** `O(1)`
