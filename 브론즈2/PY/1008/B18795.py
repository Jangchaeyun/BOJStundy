from sys import stdin

N, M = map(int, stdin.readline().split(' '))
A = map(int, stdin.readline().split(' '))
B = map(int, stdin.readline().split(' '))

sum_Ai = sum(A)
sum_Bi = sum(B)

print(sum_Ai + sum_Bi)
