from math import *
import sys
input = sys.stdin.readline

T = int(input())
for _ in range(T):
    possible_set = []
    n = int(input())
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            if i * j > n:
                break
            k = (n // i) // j
            if i * j * k == n:
                possible_set.append((i, j, k))
    min_val = 1e9
    for a, b, c in possible_set:
        if min_val > 2 * (a * b + b * c + c * a):
            min_val = 2 * (a * b + b * c + c * a)
    print(min_val)
