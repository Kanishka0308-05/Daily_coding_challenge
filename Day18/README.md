# Day 18 - Greedy Algorithms 🚀

Today I solved two classic Greedy problems from LeetCode that involve interval manipulation and optimal decision making.

## Problems Solved

### 1. Insert Interval (Medium)


**Approach:**
- Add all intervals that come before the new interval.
- Merge all overlapping intervals with the new interval.
- Add the merged interval.
- Append the remaining intervals.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

**Key Learning:**
- Learned how to efficiently merge overlapping intervals in a single traversal.
- Understood how interval-based problems can often be solved without checking every pair of intervals.

---

### 2. Minimum Number of Arrows to Burst Balloons (Medium)


**Approach:**
- Sort balloons based on their ending coordinates.
- Shoot the first arrow at the end of the first balloon.
- If the next balloon starts after the current arrow position, shoot another arrow.
- Otherwise, the current arrow bursts it as well.

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(1)` *(excluding sorting)*
