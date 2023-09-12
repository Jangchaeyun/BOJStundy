m = int(input())
n = int(input())

num = []
for i in range(m, n + 1):
    root = int(i ** 0.5)
    if i == root ** 2 : num.append(i)

if num == []:
    print(-1)
else:
    print(f'{sum(num)}\n{min(num)}')