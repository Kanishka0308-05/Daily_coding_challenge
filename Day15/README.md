#  Day 15 - LeetCode Java Solutions



### 1. Group Anagrams (Medium)

**Problem Statement:**
Given an array of strings, group the anagrams together. You can return the answer in any order.

#### Approach
- Sort each string to create a unique key.
- Store strings with the same sorted key in a HashMap.
- Return all grouped values.

#### Data Structures Used
- HashMap
- ArrayList
- Arrays.sort()

**Time Complexity:** `O(n × k log k)`

**Space Complexity:** `O(n × k)`

---

### 2. Two Sum (Easy)

**Problem Statement:**
Given an array of integers and a target value, return the indices of the two numbers that add up to the target.

#### Approach
- Traverse the array once.
- Store each number and its index in a HashMap.
- For every element, check whether its complement (`target - current`) already exists.
- Return the indices immediately when found.

#### Data Structures Used
- HashMap

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`

