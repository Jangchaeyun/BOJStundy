N = list(map(int, input()))
nLen = len(N)

if nLen == 1:
    print('NO')
else:
    a = b = 1
    for i in range(nLen - 1):
        a = b = 1
        for j in range(i + 1):
            a *= N[j]
        for k in range(i + 1, nLen):
            b *= N[k]
        if a == b:
            break;
    if a == b:
        print('YES')
    else:
        print('NO')