import sys

lst = []

a = sys.stdin.readline().rstrip()
lst.append(a.split())

cnt = 0
for i in range(len(lst[0])):
    if lst[0].count(lst[0][i]) == 1:
        cnt += 1
    else:
        cnt += 2
if cnt == len(lst[0]):
    print("yes")
else:
    print("no")