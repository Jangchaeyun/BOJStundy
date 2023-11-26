N, M = map(int, input().split())
N_lst = list(map(int, input().split()))
M_lst = list(map(int, input().split()))

for i in range(N):
    tmp = []
    x = N_lst[i]
    for j in range(M):
        if x == M_lst[j]:
            x = 0
            tmp.append(x)
        else:
            x = 1
            tmp.append(x)
    M_lst = tmp

print(M_lst[-1])