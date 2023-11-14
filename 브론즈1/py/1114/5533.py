N = int(input())
num = [[], [], []]
for _ in range(N):
    a, b, c = map(int, input().split())
    num[0].append(a)
    num[1].append(b)
    num[2].append(c)

score = [0] * N
for i in range(3):
    for j in range(N):
        if num[i].count(num[i][j]) >= 2:
            score[j] += 0
        else:
            score[j] += num[i][j]

for s in score:
    print(s)