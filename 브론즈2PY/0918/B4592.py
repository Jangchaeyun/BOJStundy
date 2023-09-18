while True:
    ans = []
    num = input().split()
    if num[0] == '0':
        break
    num.remove(num[0])
    for i in num:
        if len(ans) == 0:
            ans.append(i)
        elif ans[-1] != i:
            ans.append(i)
    ans.append('$')

    print(' '.join(ans))
