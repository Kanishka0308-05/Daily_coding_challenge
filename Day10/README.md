# Day 10- Sliding Window Hard Problems

## 1. Substring with Concatenation of All Words


### Approach
- Store the frequency of each word in a HashMap.
- Use a sliding window with word-length jumps.
- Maintain another HashMap for the current window.
- If a word appears more times than allowed, shrink the window.
- When all words are matched exactly once, store the starting index.

### Time Complexity
- **O(N × L)**
    - `N` = length of string `s`
    - `L` = length of each word

### Space Complexity
- **O(M)**
    - `M` = number of unique words



---

## 2. Minimum Window Substring

### Approach
- Store character frequencies of string `t` in a HashMap.
- Expand the right pointer to include characters into the window.
- Track how many required characters have been matched.
- Once all characters are present, shrink the window from the left to find the smallest valid window.
- Update the answer whenever a smaller valid window is found.

### Time Complexity
- **O(N)**
    - Each character is visited at most twice.

### Space Complexity
- **O(K)**
    - `K` = number of unique characters in `t`

    