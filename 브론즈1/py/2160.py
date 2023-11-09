N = int(input())
pictures = []
minimum = 36
ans1 = ans2 = 0

for i in range(N):
    row = []
    for _ in range(5):
        row.append(input())
    pictures.append(row)

for pic1 in range(N):
    for pic2 in range(pic1 + 1, N):
        cnt = 0
        for r in range(5):
            for c in range(7):
                if pictures[pic1][r][c] != pictures[pic2][r][c]:
                    cnt += 1
        if minimum > cnt:
            minimum = cnt
            ans1 = pic1
            ans2 = pic2

print(f'{ans1 + 1} {ans2 + 1}')