from sys import stdin

def _4539(x):
    x = list(map(int, str(x)))

    if len(x) == 1:
        print(*x, sep='')
    
    else:
        length = len(x)
        for i in range(length - 1, 0, -1):
            if x[i] >= 5:
                x[i - 1] = x[i - 1] + 1
                x[i] = 0
            else:
                x[i] = 0
        print(*x, sep='')
    
for _ in range(int(stdin.readline())):
    x = int(stdin.readline())
    _4539(x)