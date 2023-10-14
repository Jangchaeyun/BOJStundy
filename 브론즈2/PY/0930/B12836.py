n, q = map(int, input().split())
ans = [0] * (n + 1)
for _ in range(q):
    a, b, c = map(int, input().split())
    if a == 1:
        ans[b] += c
    elif a == 2:
        print(sum(ans[b:c + 1]))
