x = list(input())
y = list(input())
temp = []
answer = ''

for i in range(8):
    answer += x[i] + y[i]

while len(answer) != 2:
    for i in range(len(answer) - 1):
        temp.append(str((int(answer[i]) + int(answer[i + 1])) % 10))
    answer = ''.join(temp)
    temp = []

print(answer)