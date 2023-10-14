def modify(ls: list) -> str:
    result = ""
    prev = ""
    cnt = 0
    for i in range(len(ls) + 1):
        if i == 0:
            prev = ls[i]
            cnt = 1
            continue
        if i == len(ls):
            result += str(cnt)
            result += prev
            return result
        if ls[i] == prev:
            cnt += 1
        else:
            result += str(cnt)
            result += prev
            prev = ls[i]
            cnt = 1


n = int(input())
s = list(input())
for i in range(n - 1):
    s = list(modify(s))
print(modify(s))
