n = int(input())
ma, mi = 0, int(1e9)
ans = 0
for i in map(int, input().split()):
    mi = min(mi, i)
    if ma < i:
        ma = i
        mi = i
    ans = max(ma - mi, ans)
print(ans)
