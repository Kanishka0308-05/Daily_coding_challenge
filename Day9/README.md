# Day 9 - LeetCode Solutions

## 1. Minimum Size Subarray Sum (LeetCode 209)

### Approach
- Use the Sliding Window technique.
- Maintain a window with two pointers: `left` and `right`.
- Expand the window by moving the `right` pointer and adding elements to the current sum.
- When the sum becomes greater than or equal to `target`, shrink the window from the left while updating the minimum length.
- Continue until all elements are processed.



### Time Complexity
- **O(n)**

### Space Complexity
- **O(1)**

### Example
**Input**
```text
target = 7
nums = [2,3,1,2,4,3]
```

**Output**
```text
2
```



## 2. Longest Substring Without Repeating Characters (LeetCode 3)


### Approach
- Use a Sliding Window and a HashSet.
- Maintain a window containing unique characters.
- Expand the window by moving the `right` pointer.
- If a duplicate character is found, remove characters from the left until the duplicate is removed.
- Keep track of the maximum window length.



### Time Complexity
- **O(n)**

### Space Complexity
- **O(min(n, charset))**

### Example
**Input**
```text
s = "abcabcbb"
```

**Output**
```text
3
```



## Concepts Used
- Sliding Window
- Two Pointers
- HashSet
- Array Traversal
- String Processing

