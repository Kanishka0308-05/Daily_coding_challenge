# Day 02 - Merge Sorted Array & Remove Element

## Problems Solved

### 1. Merge Sorted Array (LeetCode 88)

**Difficulty:** Easy

Given two sorted integer arrays `nums1` and `nums2`, merge `nums2` into `nums1` as one sorted array.

#### Approach

* Use three pointers:

    * `i` pointing to the last valid element in `nums1`
    * `j` pointing to the last element in `nums2`
    * `k` pointing to the last position in `nums1`
* Compare elements from the end and place the larger one at position `k`.
* Continue until all elements from `nums2` are merged.

#### Time Complexity

```
O(m + n)
```

#### Space Complexity

```
O(1)
```

---

### 2. Remove Element (LeetCode 27)

**Difficulty:** Easy

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place and return the number of remaining elements.

#### Approach

* Use a pointer `k` to track the position where the next valid element should be placed.
* Traverse the array.
* Whenever an element is not equal to `val`, place it at index `k` and increment `k`.
* Return `k` as the count of remaining elements.

#### Time Complexity

```
O(n)
```

#### Space Complexity

```
O(1)
```

---

## Key Concepts Learned

* Two Pointer Technique
* In-place Array Modification
* Array Traversal
* Efficient Space Optimization
* Sorted Array Manipulation

---

## Solutions

### Merge Sorted Array

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
```

### Remove Element

```java
class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
```

---

### Summary

Day 02 focused on solving array-based problems using efficient in-place techniques. Both problems were solved with optimal time complexity while maintaining constant extra space usage.
