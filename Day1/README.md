# Day 01 - Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input has exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

---

## Example 1

Input:
nums = [2,7,11,15]
target = 9

Output:
[0,1]

Explanation:
nums[0] + nums[1] = 2 + 7 = 9

---

## Approach

### Brute Force
Check every pair of elements.

Time Complexity: O(n²)

### Optimized Approach (HashMap)

Store each number and its index in a HashMap.

For every element:

1. Calculate the complement:
   complement = target - nums[i]
2. Check if complement already exists in the map.
3. If yes, return both indices.
4. Otherwise store the current number and index.

This allows lookup in constant time.

---

## Algorithm

1. Create a HashMap.
2. Traverse the array.
3. Calculate complement.
4. If complement exists in map:
- Return stored index and current index.
5. Otherwise add current number and index to map.
6. Return answer.

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