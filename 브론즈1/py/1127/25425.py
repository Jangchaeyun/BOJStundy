N, M, a, K = map(int, input().split())

max_val, min_val = 0, 0

if a - K >= N - 1:
    max_val = N - 1 + 1
    if (a - K) % M == 0:
        min_val = (a - K) // M + 1
    else:
        min_val = (a - K) // M + 1 + 1

else:
    max_val = a - K + 1
    if a - K == 0:
        min_val = 1
    elif (a - K) % M == 0:
        min_val = (a - K) // M + 1
    else:
        min_val = (a - K) // M + 1 + 1

print(max_val, min_val)