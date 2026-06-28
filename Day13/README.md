# Day 13 - HashMap & Matrix Problems

Today, I solved three LeetCode problems focused on **Matrix Simulation** and **HashMap/String Mapping** concepts.

## Problems Solved

### 1. Game of Life (Medium)



**Approach:**
- Traverse every cell and count its live neighbors.
- Use temporary values to preserve the original state during updates:
    - `-1` → Live → Dead
    - `2` → Dead → Live
- Perform a second traversal to convert temporary values into the final board.

**Time Complexity:** `O(m × n)`

**Space Complexity:** `O(1)`

---

### 2. Ransom Note (Easy)

**Approach:**
- Count the frequency of each character in the magazine.
- Traverse the ransom note and decrease the corresponding frequency.
- If any required character is unavailable, return `false`; otherwise, return `true`.

**Time Complexity:** `O(n + m)`

**Space Complexity:** `O(1)`

---

### 3. Isomorphic Strings (Easy)



**Approach:**
- Maintain two mapping arrays to track the latest occurrence of characters in both strings.
- If the mappings differ at any position, the strings are not isomorphic.
- Otherwise, update the mappings and continue until the end.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

---

