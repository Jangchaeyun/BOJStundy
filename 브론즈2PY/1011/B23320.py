lst1 = []
N = int(input())
x = list(input().split())
y, z = map(int, input().split())
for i in x:
    if int(i) >= z:
        lst1.append(int(i))
print(f'{round((N * (y / 100)))} {len(lst1)}')
