# Day 17 - LeetCode Solutions

## 📅 Progress
Completed **Day 17** of my LeetCode journey. Today's problems focused on **Intervals**, including identifying continuous ranges and merging overlapping intervals efficiently.

---

## ✅ Problems Solved

### 1. Summary Ranges (Easy)
**Topics:** Array, Two Pointers

**Approach:**
- Traverse the sorted array while tracking the start of each consecutive sequence.
- When a break in continuity is found, record the current range.
- If the range contains only one number, store that number; otherwise, store it in the format `start->end`.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)` (excluding the output list)

---

### 2. Merge Intervals (Medium)
**Topics:** Array, Sorting

**Approach:**
- Sort the intervals based on their starting values.
- Compare each interval with the previously merged interval.
- Merge overlapping intervals by updating the ending value.
- Add non-overlapping intervals directly to the result.

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(n)`


