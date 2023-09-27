import sys
input = sys.stdin.readline
r_d = 0
r_n = 1

for i in range(int(input())):
    num = list(map(int, input().split()))
    r_n = int(r_n * num[1] / num[0])
    r_d = (r_d + num[2]) % 2

print(r_d, r_n)
