N, M = map(int, input().split())
sx, sy = map(int, input().split())
ex, ey = map(int, input().split())

if N == 1 or M == 1:
    if sx == ex and sy == ey:
        print("YES")
    else:
        print("NO")

elif sx % 2 == sy % 2:
    if ex % 2 == ey % 2:
        print("YES")
    else:
        print("NO")

elif sx % 2 != sy % 2:
    if ex % 2 == ey % 2:
        print("NO")
    else:
        print("YES")