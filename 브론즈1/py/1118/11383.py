N, M = map(int, input().split())
img1, img2 = [input() for _ in range(N)], [input() for _ in range(N)]
eyfa = True

for i in range(N):
    compare = ''
    for j in img1[i]:
        compare += j * 2
    if compare != img2[i]:
        eyfa = False
        break
print('Eyfa' if eyfa else 'Not Eyfa')
