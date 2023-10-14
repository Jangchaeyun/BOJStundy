A = int(input())
B = int(input())
C = int(input())

multiple = str(A * B * C)

for num in range(10):
    print(multiple.count(str(num)))
