chapter = []

limit_time = 30
half = 0
result = 0

n = int(input())

for i in range(n):
    time = int(input())
    chapter.append(time)

for j in range(n):
    if limit_time <= 0:
        limit_time = 30

    half = chapter[j] / 2

    if limit_time - chapter[j] >= 0:
        limit_time = limit_time - chapter[j]
        result += 1
    
    elif limit_time - chapter[j] <= 0 and limit_time >= half:
        limit_time = 0
        result += 1
    
    elif limit_time - chapter[j] <= 0 and limit_time < half:
        limit_time = 0
        continue

print(result)