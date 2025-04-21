# Task 2: Buggy Diamond (with AI allowed)
# Final output should look like:

#     *
#    ***
#   *****
#  *******
# *********
#  *******
#   *****
#    ***
#     *

n = 5
for i in range(1, n+1):
    print(" " * (n - i) + "*" * (2 * i - 1))
# Same as task1_triangle.py

# Revised lower half
for i in range(n-1): 
    print(" " * (i + 1) + "*" * (2 * (n - i - 1) - 1))