from sys import stdin

def solve():
    n = int(stdin.readline())
    pos = [0, 0]
    mode, length = 0, 1
    cnt = 0
    while 1:
        for i in range(2):
            for _ in range(2):
                if i == 0:
                    if mode == 0:
                        for _ in range(length):
                            pos[1] += 1
                            cnt += 1
                            if n == cnt:
                                return pos
                    else:
                        for _ in range(length):
                            pos[0] += 1
                            cnt += 1
                            if n == cnt:
                                return pos
                if i == 1:
                    if mode == 0:
                        for _ in range(length):
                            pos[1] -= 1
                            cnt += 1
                            if n == cnt:
                                return pos
                    else:
                        for _ in range(length):
                            pos[0] -= 1
                            cnt += 1
                            if n == cnt:
                                return pos
                mode = 1 if mode == 0 else 0
            
            length += 1
print(*solve())