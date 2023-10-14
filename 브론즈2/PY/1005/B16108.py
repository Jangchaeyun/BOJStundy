N = int(input())

parking = [0 for i in range(N)]
for i in range(2):
    s = input()
    for j in range(N):
        if s[j] == 'C':
            parking[j] += 1

cnt = parking.count(2)
print(cnt)
