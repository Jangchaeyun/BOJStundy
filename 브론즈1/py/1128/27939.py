import sys
input = sys.stdin.readline

n = int(input())
kind = list(input().rstrip().split())
m, k = map(int, input().split())

assist = []
for _ in range(m):
    assist.append(list(map(int, input().split())))

for i in assist:
    for j in i:
        if kind[j - 1] == "P":
            break
    else:
        print("W")
        break
else:
    print("P")