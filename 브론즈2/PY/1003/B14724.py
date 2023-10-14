club = ['PROBRAIN', 'GROW', 'ARGOS', 'ADMIN',
        'ANT', 'MOTION', 'SPG', 'COMON', 'ALMIGHTY']
d = dict()
arr = list()
key = list()
N = int(input())

for i in range(9):
    a = list(map(int, input().split()))
    d[club[i]] = max(a)
    arr.append(max(a))
    key = list(d.keys())
arr_max = max(arr)

for i in range(len(key)):
    if arr_max == d[key[i]]:
        print(key[i])
