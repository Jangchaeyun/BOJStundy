n = int(input())
ans = [0] * 26

for _ in range(n):
    s = [input().strip() for _ in range(2)]
    cnt = [[0] * 26 for _ in range(2)]

    for i in range(2):
        for j in range(len(s[i])):
            cnt[i][ord(s[i][j]) - ord('a')] += 1

    for i in range(26):
        ans[i] += max(cnt[0][i], cnt[1][i])

for val in ans:
    print(val)