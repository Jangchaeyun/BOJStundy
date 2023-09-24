from collections import deque
vowel = ['a', 'e', 'i', 'o', 'u']
while 1:
    s = input()
    if s == '#':
        break
    tmp = deque()
    for i in s:
        tmp.append(i)
    if vowel not in tmp:
        print(s+"ay")
    else:
        while tmp[0] not in vowel:
            tmp.rotate(-1)
        for i in tmp:
            print(i, end='')
        print("ay")
