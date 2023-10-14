import sys
input = sys.stdin.readline

R, C = map(int, input().split())
A, B = map(int, input().split())

for i in range(R * A):
    for j in range(C * B):
        if ((i % (A * 2)) < A) == ((j % (B * 2)) < B):
            print("X", end="")
        else:
            print(".", end="")
    print("")
