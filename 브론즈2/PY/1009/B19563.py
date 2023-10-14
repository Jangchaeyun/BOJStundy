a, b, c = map(int, input().split(' '))

ab_abs_sum = abs(a) + abs(b)

if (ab_abs_sum <= c) and ((ab_abs_sum % 2 == 0 and c % 2 == 0) or (ab_abs_sum % 2 == 1 and c % 2 == 1)):
    print("YES")
else:
    print("NO")
