import sys
sys.stdin = open("input.txt")

while True:
    N = int(input())
    if N == 0:
        break
    s = input()
    arr = []
    for i in range(len(s) // N):
        arr.append(list(s[N * i : N * (i + 1)][::-1]) if i % 2 else list(s[N * i : N * (i + 1)]))
    answer = ''
    for a in zip(*arr):
        answer += ''.join(a)
    print(answer)