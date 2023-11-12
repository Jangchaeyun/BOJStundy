R, C = map(int, input().split())

parking_lot = []
for _ in range(R):
    parking_lot.append(input())

n_zero = 0
n_one = 0
n_two = 0
n_three = 0
n_four = 0

for r in range(R):
    for c in range(C):
        if r + 1 == R or c + 1 == C:
            break
        w = parking_lot[r][c]
        x = parking_lot[r][c+1]
        y = parking_lot[r+1][c]
        z = parking_lot[r+1][c+1]

        tmp = w + x + y + z

        if '#' in tmp:
            continue
        else:
            n_car = tmp.count("X")
            if n_car == 0:
                n_zero += 1
            elif n_car == 1:
                n_one += 1
            elif n_car == 2:
                n_two += 1
            elif n_car == 3:
                n_three += 1
            elif n_car == 4:
                n_four += 1

print(n_zero)
print(n_one)
print(n_two)
print(n_three)
print(n_four)