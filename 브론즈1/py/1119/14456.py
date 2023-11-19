N = int(input())
cnt1 = 0
cnt2 = 0

for _ in range(N):
    a, b = map(int, input().split())

    if (a ==1 and b == 2) or (a == 2 and b == 3) or (a == 3 and b == 1):
        cnt1 += 1
    elif (a == 1 and b == 3) or (a == 3 and b == 2) or (a == 2 and b == 1):
        cnt2 += 1

print(max(cnt1, cnt2))