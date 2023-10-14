n = int(input())
start = int(input())
ans = 0
for i in range(n):
    go = int(input())
    ans += min(abs(start - go), 360 - start + go, start + 360 - go)
    start = go
print(ans)
