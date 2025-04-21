# Task 2: Buggy Diamond (with AI allowed)
n = 5
for i in range(1, n+1):
    print(" " * (n - i) + "*" * (2 * i - 1))

# Buggy lower half
for i in range(n-1):
    print(" " * (n - i) + "*" * (2 * i - 1))