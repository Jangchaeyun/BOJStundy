A, K, M = map(int, input().split())
arr = list(map(int, input().split()))
currentPos = K

for i in range(M):
    calculate = int(input())
    if calculate > 0 and currentPos <= calculate:
        currentPos = abs(currentPos - (calculate + 1))
    elif calculate < 0 and currentPos > calculate + A:
        currentPos = abs(A - currentPos + 1 + (A + calculate))
    else:
        continue
print(currentPos)