# Task 2: Fix Buggy Diamond (With AI Assistance)

## Instructions

You are provided with a buggy script intended to print a diamond of stars (`*`) with height 5.

```python
n = 5
for i in range(1, n+1):
    print(" " * (n - i) + "*" * (2 * i - 1))

# Buggy lower half
for i in range(n-1):
    print(" " * (n - i) + "*" * (2 * i - 1))
```

```java
public class Task2DiamondBuggy {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));

        }
    }
}

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
