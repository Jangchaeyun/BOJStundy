t = int(input())
for i in range(t):
    nickname = input().split()
    nickname[0] = 'god'
    print(*nickname, sep='')
