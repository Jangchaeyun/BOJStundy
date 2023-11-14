cnt = 0
while 1:
    cnt += 1
    n = int(input())
    if n == 0:
        break
    t = set([input() for _ in range(n)])
    print(f'Week {cnt} {len(t)}')