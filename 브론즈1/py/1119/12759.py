from itertools import combinations

def lastp(p):
    if p == 1: return 2
    else: return 1

def comb(p, t):
    sort_li = sorted(t)
    li = [(1, 2, 3), (4, 5, 6), (7, 8, 9), (1, 4, 7), (2, 5, 8), (3, 6, 9), (1, 5, 9), (3, 5, 7)]
    combi = list(combinations(sort_li, 3))
    for com in combi:
        if com in li:
            return p
    return 0

num = {(1, 1) : 1, (1, 2) : 2, (1, 3) : 3, (2, 1) : 4, (2, 2) : 5, (2, 3) : 6, (3, 1) : 7, (3, 2) : 8, (3, 3) : 9}
first = []
last = []
flag = 0
res = 0
player1 = int(input())
player2 = lastp(player1)
for k in range(1, 10):
    a, b = map(int, input().split())
    if k % 2 != 0:
        first.append(num[(a, b)])
        if k >= 5:
            flag = comb(player1, first)
            if flag != 0:
                print(flag)
                res = flag
                break
    else:
        last.append(num[(a, b)])
        if k >= 6:
            flag = comb(player2, last)
            if flag != 0:
                print(flag)
                res = flag
                break

if res == 0:
    print(0)