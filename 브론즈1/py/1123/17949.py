num = input()
N = int(input())

i = 0
for t in input().split():
    if t == 'char':
        print(int(num[i : i + 2], 16), end=' ')
        i += 2
    elif t == 'int':
        print(int(num[i : i + 8], 16), end=' ')
        i += 8
    else:
        print(int(num[i : i + 16], 16), end=' ')
        i += 16
