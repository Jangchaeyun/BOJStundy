from sys import stdin

N = int(stdin.readline())
A = tuple(map(int, stdin.readline().split(' ')))
penguin_idx = A.index(-1)
left_min = min(A[:penguin_idx])
right_min = min(A[penguin_idx+1:])

print(left_min + right_min)
