N = int(input())
S = list(reversed(input()))
for i in range(1, N):
    k = []
    for _ in range(len(str(i))):
        num = S.pop()
        k.append(num)
    if int(''.join(k)) != i:
        print(i)
        break
else:
    print(N)
