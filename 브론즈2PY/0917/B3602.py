import sys

input = sys.stdin.readline
n, m = sorted(map(int, input().split()))
if m == 0:
    print("Impossible")
else:
    ans = 0
    for i in range(1, 143):
        total_tiles = i ** 2
        if i % 2 == 0:
            w_tiles = total_tiles // 2
            b_tiles = total_tiles // 2
        else:
            w_tiles = total_tiles // 2
            b_tiles = total_tiles // 2 + 1
        if w_tiles <= n and b_tiles <= m:
            ans = i
        else:
            break
    print(ans)
