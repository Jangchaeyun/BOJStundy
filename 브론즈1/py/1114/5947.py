n, q, p = map(int, input().split())
a = [[0] * 51 for _ in range(50001)]
check = [0] * 50001

for i in range(1, n + 1):
    a[i][1 : q + 1] = map(int, input().split())

for _ in range(p):
    qj, aj = map(int, input().split())
    for j in range(1, n + 1):
        if a[j][qj] == aj:
            check[j] += 1

ans = sum(1 for c in check[1 : n + 1] if c == p)
print(ans)