n, l, h = map(int, input().split())
scores = sorted(list(map(int, input().split())))
ans = sum(scores[l : n - h]) / (n - l - h)
print(ans)