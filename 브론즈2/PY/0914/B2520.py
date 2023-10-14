gram1 = [0.5, 0.5, 0.25, 0.0625, 0.5625]
gram2 = [1, 30, 25, 10]

T = int(input())
for _ in range(T):
    input()

    line1 = list(map(int, input().split()))
    max_val = float('inf')

    for i in range(5):
        now_max = line1[i] // gram1[i]
        if max_val > now_max:
            max_val = now_max

    line2 = list(map(int, input().split()))
    cnt = 0

    for i in range(4):
        cnt += line2[i] // gram2[i]

    if max_val < cnt:
        print(max_val)
    else:
        print(cnt)
