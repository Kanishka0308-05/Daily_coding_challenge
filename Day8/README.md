# Day 8 - Two Pointers Problems

This folder contains Java solutions for the following LeetCode Two Pointers problems:

1. Valid Palindrome
2. Is Subsequence
3. Two Sum II - Input Array Is Sorted
4. Container With Most Water
5. 3Sum

---

## 1. Valid Palindrome

**Difficulty:** Easy

### Approach
- Use two pointers, one at the beginning and one at the end of the string.
- Skip non-alphanumeric characters.
- Compare characters after converting them to lowercase.
- If all matching characters are equal, the string is a palindrome.

### Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## 2. Is Subsequence

**Difficulty:** Easy

### Approach
- Use two pointers for strings `s` and `t`.
- Traverse string `t` and match characters of `s` in order.
- If all characters of `s` are matched, return true.

### Complexity
- **Time Complexity:** O(n + m)
- **Space Complexity:** O(1)

---

## 3. Two Sum II - Input Array Is Sorted

**Difficulty:** Medium

### Approach
- Since the array is sorted, place one pointer at the start and another at the end.
- Calculate the sum of both elements.
- Move the left pointer if the sum is smaller than the target.
- Move the right pointer if the sum is larger than the target.
- Return the indices when the target sum is found.

### Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## 4. Container With Most Water

**Difficulty:** Medium

### Approach
- Use two pointers at both ends of the array.
- Calculate the area formed by the two heights.
- Move the pointer with the smaller height inward.
- Track the maximum area encountered.

### Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## 5. 3Sum

**Difficulty:** Medium

### Approach
- Sort the array.
- Fix one element and use two pointers to find the remaining two elements.
- Skip duplicate values to avoid repeated triplets.
- Store all unique triplets whose sum equals zero.

### Complexity
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1) (excluding output)

---

## Key Concepts

- Two Pointers
- Array Traversal
- String Processing
- Sorting
- Duplicate Handling
- Optimization Techniques

---

## Summary

| Problem | Difficulty | Time Complexity | Space Complexity |
|----------|------------|----------------|------------------|
| Valid Palindrome | Easy | O(n) | O(1) |
| Is Subsequence | Easy | O(n + m) | O(1) |
| Two Sum II | Medium | O(n) | O(1) |
| Container With Most Water | Medium | O(n) | O(1) |
| 3Sum | Medium | O(n²) | O(1)* |

