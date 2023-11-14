n, m = map(int, input().split())

ans, r = 0, 1
while n % 2 == 1 and m % 2 == 1:
    ans += r
    n //= 2
    m //= 2
    r *= 4

print(ans)