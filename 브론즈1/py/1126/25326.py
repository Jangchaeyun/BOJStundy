n, m = map(int, input().split())
lst = []

for _ in range(n):
    lst.append(input().split())

for _ in range(m):
    sfc = input().split()
    cnt = 0
    for i in lst:
        check = 0
        for j in range(3):
            if sfc[j] == '-':
                check += 1
                continue
            if sfc[j] == i[j]:
                check += 1
        if check == 3:
            cnt += 1
    print(cnt)