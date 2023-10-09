import sys
input = sys.stdin.readline

N = int(input())

result = []
MAX = 0
for _ in range(N):
    A, B = map(str, input().split())
    result.append([A, int(B)])
    if int(B) > MAX:
        MAX = int(B)

result.sort(key=lambda x: x[1], reverse=True)

name = []
for i, j in result:
    if j == MAX:
        name.append(i)

name.sort()

print(name[0])
