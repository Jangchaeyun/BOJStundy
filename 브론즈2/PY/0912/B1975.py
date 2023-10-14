from sys import stdin

def f(n, i):
    return 1 + f(n // i, i) if n % i == 0 else 0

for _ in range(int(stdin.readline())):
    N = int(stdin.readline())
    cnt = 0
    for i in range(2, N + 1):
        cnt += f(N, i)
    print(cnt)