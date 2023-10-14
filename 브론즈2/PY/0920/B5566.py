import sys
input = sys.stdin.readline

n, m = map(int, input().split())
bord = [int(input()) for _ in range(n)]
dice = [int(input()) for _ in range(m)]

now = 0
cnt = 0

for i in range(m):
    cnt += 1
    now += dice[i]
    if now >= n - 1:
        break
    now += bord[now]
    if now >= n - 1:
        break

print(cnt)
