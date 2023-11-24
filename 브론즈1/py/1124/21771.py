r, c = map(int, input().split())
rg, cg, rp, cp = map(int, input().split())
board = [input().strip() for _ in range(r)]
pCnt = sum(row.count('P') for row in board)

if pCnt == rp * cp:
    print(0)
else:
    print(1)