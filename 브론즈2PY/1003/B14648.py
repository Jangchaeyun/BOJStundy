from sys import stdin

n, q = map(int, stdin.readline().split(' '))
numbers = list(map(int, stdin.readline().split(' ')))

for query_idx in range(q):
    query = list(map(int, stdin.readline().split(' ')))
    type = query[0]

    if type == 1:
        a, b = query[1], query[2]
        print(sum(numbers[a - 1:b]))
        numbers[a - 1], numbers[b - 1] = numbers[b - 1], numbers[a - 1]
    else:
        a, b, c, d = query[1], query[2], query[3], query[4]
        ab_sum = sum(numbers[a - 1: b])
        cd_sum = sum(numbers[c - 1: d])
        print(ab_sum - cd_sum)
