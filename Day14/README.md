# Day 14 - LeetCode Java Solutions

## Problems Solved

### 1. Word Pattern (Easy)

**Problem Statement:**
Given a `pattern` and a string `s`, determine if `s` follows the same pattern.

**Approach:**
- Split the input string into words.
- If the number of words doesn't match the pattern length, return `false`.
- Use two HashMaps:
    - Character → Word
    - Word → Character
- Ensure each character consistently maps to one word and each word maps back to the same character.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`

---

### 2. Valid Anagram (Easy)

**Problem Statement:**
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, otherwise return `false`.

**Approach:**
- If the string lengths are different, return `false`.
- Use an integer array of size 26 to count character frequencies.
- Increment the count for characters in `s` and decrement for characters in `t`.
- If all counts are zero, the strings are anagrams.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

