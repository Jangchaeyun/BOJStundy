MOD = 16769023

def pw(a, p):
    if p == 0:
        return 1
    if p == 1:
        return a % MOD
    half = pw(a, p // 2)
    sqr = (half * half) % MOD
    if p % 2 == 1:
        return (sqr * (a % MOD)) % MOD
    return sqr

def main():
    n = int(input())
    print(pw(2, (n + 1) // 2))

if __name__ == "__main__":
    main()