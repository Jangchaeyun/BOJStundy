import sys

def main():
    input_line = sys.stdin.readline().strip()
    d1, d2, X = map(int, input_line.split())
    D1 = max(d1, d2)
    D2 = min(d1, d2)
    m = 100 - X
    v = m / D2
    m = X
    v += m / D1
    print(100 / v)

if __name__ == "__main__":
    main()