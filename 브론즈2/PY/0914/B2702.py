import sys


def lcm(a, b):
    return int((a * b) / gcd(a, b))


def gcd(a, b):
    if a == 0:
        return b
    else:
        return gcd(b % a, a)


t = int(sys.stdin.readline())

for _ in range(t):
    a, b = map(int, input().split())
    print(lcm(a, b), gcd(a, b))
