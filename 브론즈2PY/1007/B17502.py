n = int(input())
ans = list(input())
for j in range(n // 2):
    if ans[j] == "?":
        ans[j] = ans[n - 1 - j]
for j in range(n // 2):
    if ans[n - 1 - j] == "?":
        ans[n - 1 - j] = ans[j]
for i in range(n):
    if ans[i] == "?":
        ans[i] = "a"
print("".join(ans))
