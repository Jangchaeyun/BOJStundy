def main():
    n = int(input())
    s = input().strip()

    for k in range(1, n + 1):
        ok = True
        for i in range(n - k + 1):
            tmp = s[i : i + k]
            for j in range(n - k + 1):
                if i == j:
                    continue
                if tmp == s[j : j + k]:
                    ok = False
        if ok:
            print(k)
            return

if __name__ == "__main__":
    main()