N = int(input())
sent = input()
ans = ""
for i in range(1, N):
    a = sent[:i]
    r = sent[::-1]
    b = r[:i][::-1]

    check = 0
    for j in range(len(a)):
        if a[j] != b[j]:
            check += 1
    if check == 1:
        ans = "YES"
        break
if ans != "YES":
    ans = "NO"
print(ans)
