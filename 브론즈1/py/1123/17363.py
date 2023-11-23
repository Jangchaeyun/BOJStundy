d = {'.': 46, 'O': 79, '-': 124, '|': 45, '/': 92, '\\': 47,
     '^': 60, '<': 118, 'v': 62, '>': 94}

N, M = map(int, input().split())
box = []
for _ in range(N):
    box.append(input())

rotate = []
for i in range(M - 1, -1, -1):
    row = []
    for j in range(N):
        row.append('%c' % d[box[j][i]])
    rotate.append(row)

for r in rotate:
    print(''.join(r))