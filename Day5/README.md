# Day X - LeetCode Solutions

This folder contains Java solutions for the following LeetCode problems.

---

## 1. Insert Delete GetRandom O(1) (LeetCode 380)

### Problem
Design a data structure that supports:
- `insert(val)` in O(1)
- `remove(val)` in O(1)
- `getRandom()` in O(1)

### Approach
- Use an `ArrayList` to store elements.
- Use a `HashMap` to store each element's index in the list.
- For deletion, swap the element with the last element and remove it.

### Time Complexity
- Insert: **O(1)**
- Remove: **O(1)**
- Get Random: **O(1)**

### Space Complexity
- **O(n)**

---

## 2. Product of Array Except Self (LeetCode 238)

### Problem
Return an array where each element is the product of all elements except itself without using division.

### Approach
- Store prefix products in the result array.
- Traverse from right to left while maintaining a suffix product.
- Multiply prefix and suffix products to get the answer.

### Time Complexity
- **O(n)**

### Space Complexity
- **O(1)** (excluding output array)

---

## 3. Gas Station (LeetCode 134)

### Problem
Find the starting gas station from which you can complete a circular route.

### Approach
- If total gas is less than total cost, return `-1`.
- Maintain current tank balance.
- Whenever balance becomes negative, choose the next station as the new starting point.

### Time Complexity
- **O(n)**

### Space Complexity
- **O(1)**

---

## 4. Candy (LeetCode 135)

### Problem
Distribute candies such that:
1. Every child gets at least one candy.
2. Children with higher ratings than their neighbors receive more candies.

### Approach
- Initialize every child with one candy.
- Traverse left to right to satisfy the left neighbor condition.
- Traverse right to left to satisfy the right neighbor condition.
- Sum all candies.

### Time Complexity
- **O(n)**

### Space Complexity
- **O(n)**

---

## 5. Trapping Rain Water (LeetCode 42)

### Problem
Calculate how much rainwater can be trapped between bars.

### Approach
- Use the Two Pointer technique.
- Maintain `leftMax` and `rightMax`.
- Move the pointer with the smaller height.
- Add trapped water whenever the current height is smaller than the corresponding maximum.

### Time Complexity
- **O(n)**

### Space Complexity
- **O(1)**

---

## Concepts Practiced

- HashMap
- ArrayList
- Prefix & Suffix Products
- Greedy Algorithms
- Two Pointer Technique
- Simulation
- Array Traversal
- Space Optimization

---

## Language Used

- Java