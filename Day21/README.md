# Day 21 - Basic Calculator

## Approach

This problem can be solved using a **Stack** to handle expressions inside parentheses.

### Key Idea

- Maintain a running `result`, `number`, and `sign`.
- Build multi-digit numbers as they are encountered.
- When a `+` or `-` is found, add the current number to the result using the current sign.
- When a `(` is encountered:
    - Store the current result and sign in the stack.
    - Reset them for the new sub-expression.
- When a `)` is encountered:
    - Finish the current sub-expression.
    - Apply the sign before the parenthesis.
    - Add it to the previous result stored in the stack.

This approach correctly handles nested parentheses and evaluates the expression in a single pass.

---

## Algorithm

1. Initialize:
    - `result = 0`
    - `number = 0`
    - `sign = 1`
    - A stack to store previous results and signs.
2. Traverse the string character by character.
3. If the character is a digit:
    - Build the current number.
4. If the character is `+` or `-`:
    - Add the current number to the result using the current sign.
    - Update the sign.
5. If the character is `(`:
    - Push the current result and sign onto the stack.
    - Reset result and sign.
6. If the character is `)`:
    - Complete the current expression.
    - Apply the stored sign and previous result from the stack.
7. Return the final result.

