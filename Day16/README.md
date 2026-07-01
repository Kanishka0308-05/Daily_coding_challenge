# Day 16 - LeetCode Challenge



### 1. Happy Number (Easy)

**Approach**
- Use a HashSet to store previously seen numbers.
- Repeatedly replace the number with the sum of the squares of its digits.
- If the number becomes 1, it is a happy number.
- If a number repeats, a cycle exists, so return false.

**Time Complexity:** O(log n)

**Space Complexity:** O(log n)

---

### 2. Contains Duplicate II (Easy)

**Approach**
- Store each element's latest index in a HashMap.
- If the current element has appeared before and the index difference is at most `k`, return true.
- Otherwise, update its latest index.

**Time Complexity:** O(n)

**Space Complexity:** O(n)

---

### 3. Longest Consecutive Sequence (Medium)

**Approach**
- Store all numbers in a HashSet.
- Only start counting a sequence if the current number has no predecessor (`num - 1`).
- Count consecutive numbers until the sequence ends.
- Track the maximum sequence length.

**Time Complexity:** O(n)

**Space Complexity:** O(n)

