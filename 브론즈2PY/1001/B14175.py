import sys

M, N, K = map(int, sys.stdin.readline().split())

li = []
for i in range(M):
    s = sys.stdin.readline().split()
    li.append(s)

for i in range(M):
    for j in range(K):
        for k in range(N):
            print(li[i][0][k] * K, end="")
        print()
