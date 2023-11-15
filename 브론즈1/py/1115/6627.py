while 1:
    n = input()
    if n == '0':
        break
    s = sum(map(int, list(n)))
    i = 11
    while 1:
        t = int(n) * i
        if sum(map(int, list(str(t)))) == s:
            print(i)
            break
        i += 1