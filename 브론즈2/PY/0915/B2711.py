t = int(input())

for _ in range(t):
    n, data = input().split()
    n = int(n)
    print(data[:n-1], data[n:], sep='')
