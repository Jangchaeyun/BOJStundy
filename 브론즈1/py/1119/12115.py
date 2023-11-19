MAX = 1000

N, M = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(N)]

Q = int(input())

for _ in range(Q):
    v = list(map(int, input().split()))

    num = 0
    for j in range(N):
        flag = True
        for k in range(M):
            if v[k] == -1:
                continue
            if v[k] != arr[j][k]:
                flag = False
                break
        if flag:
            num += 1
            
    print(num)