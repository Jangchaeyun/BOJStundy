from math import factorial

while 1:
    n = int(input())
    if n == 0:
        break
    _ = input()
    print(f"{n}! --")
    res = str(factorial(n))
    li = [res.count(str(i)) for i in range(10)]
    for i in range(2):
        for j in range(5):
            if j == 0:
                print("   (%d)%5d" % (5*i + j, li[5*i + j]), end='')
            else:
                print("    (%d)%5d" % (5*i + j, li[5*i + j]), end='')
        print(' ')
