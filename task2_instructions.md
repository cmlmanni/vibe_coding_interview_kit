# Task 2: Fix Buggy Diamond (With AI Assistance)

## Instructions

You are provided with a buggy Python script intended to print a diamond of stars (`*`) with height 5.

```python
n = 5
for i in range(1, n+1):
    print(" " * (n - i) + "*" * (2 * i - 1))

# Buggy lower half
for i in range(n-1):
    print(" " * (n - i) + "*" * (2 * i - 1))
```

Use any AI coding assistant (e.g., Copilot, Cursor, ChatGPT) to debug, modify, or understand this code.

Feel free to ask for:

- Bug explanations
- Code suggestions
- Complete rewrites

Then run and verify the output.

## Goal

Final output should look like:

```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

## Please send both scripts that you completed to the interviewer for research purposes.
