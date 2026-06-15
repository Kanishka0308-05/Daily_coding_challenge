# Day 01 - Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input has exactly one valid solution, and you may not use the same element twice.

The answer can be returned in any order.

---

## Example

### Input
```text
nums = [2, 7, 11, 15]
target = 9
```

### Output
```text
[0, 1]
```

### Explanation
```text
nums[0] + nums[1] = 2 + 7 = 9
```

---

## Approach

### Optimized Approach using HashMap

A HashMap is used to store previously visited numbers along with their indices.

For each element in the array:

1. Calculate the complement:
   ```
   complement = target - nums[i]
   ```
2. Check whether the complement already exists in the HashMap.
3. If it exists, we have found the required pair and return their indices.
4. Otherwise, store the current number and its index in the HashMap.

Since HashMap lookup operations take constant time on average, this approach is highly efficient.

---

## Algorithm

1. Create an empty HashMap.
2. Traverse the array from left to right.
3. For each element:
   - Calculate its complement.
   - Check if the complement exists in the map.
   - If found, return the stored index and current index.
   - Otherwise, store the current element and its index.
4. Return an empty array if no valid pair exists.

---

## Java Solution

```java
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
```

---

## Complexity Analysis

### Time Complexity
```
O(n)
```

Each element is visited once, and HashMap operations take O(1) average time.

### Space Complexity
```
O(n)
```

In the worst case, all elements are stored in the HashMap.

---

## Key Concepts

- HashMap
- Array Traversal
- Complement Search
- Time Optimization
- LeetCode Problem Solving

---

### LeetCode Details

- Problem Number: 1
- Problem Name: Two Sum
- Difficulty: Easy3