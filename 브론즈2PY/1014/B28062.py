N = int(input())
candy = list(map(int, input().split()))
result = 0
odd_candy = []

for i in candy:
    if i % 2 == 1:
        odd_candy.append(i)
    else:
        result += i

if len(odd_candy) % 2 == 1:
    odd_candy.sort(reverse=True)
    del odd_candy[-1]
    result += sum(odd_candy)
else:
    result += sum(odd_candy)

print(result)
