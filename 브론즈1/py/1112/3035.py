R, C, ZR, ZC = map(int, input().split())
papper = []
scanner = []
for _ in range(R):
    papper.append(input())

for i in range(R):
    row = []
    for j in range(C):
        row.append(papper[i][j] * ZC)

    for _ in range(ZR):
        scanner.append(row)

for s in scanner:
    print(''.join(s))