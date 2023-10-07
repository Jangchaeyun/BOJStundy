N, M = map(int, input().split())
nums = list(map(int, input().split()))
front = nums[:N]
back = nums[N:]

for _ in range(M):
    for i, num in enumerate(front):
        call = int(input())
        if num <= call:
            front[i], back[i] = back[i], front[i]
print(sum(front))
