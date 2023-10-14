N = int(input())
li = list(map(int, input().split()))
res = [li[0]]
for i in range(1, N):
    res.append(li[i] * (i + 1) - sum(res))
print(*res)
