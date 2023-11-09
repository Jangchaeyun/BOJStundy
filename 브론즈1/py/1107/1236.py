n, m = map(int, input().split())
borad = []

for _ in range(n):
    borad.append(input())

a, b = 0, 0

for i in range(n):
    if "X" not in borad[i]:
        a += 1

for j in range(m):
    if "X" not in [borad[i][j] for i in range(n)]:
        b += 1
        
print(max(a, b))