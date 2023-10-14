import sys
n, m = map(int, sys.stdin.readline().split())
ral = list(map(int, sys.stdin.readline().split()))
cnt = n - 1
standard = 0
for i in range(n - 1):
    compare = list(map(int, sys.stdin.readline().split()))
    trend_sum = 0
    for j in range(m):
        trend_sum += abs(ral[j] - compare[j])
    if trend_sum > 2000:
        standard += 1

if standard >= cnt / 2:
    print("YES")
else:
    print("NO")
