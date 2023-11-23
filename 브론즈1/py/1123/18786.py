class Coord:
    def __init__(self, x, y):
        self.x = x
        self.y = y

def main():
    n = int(input())
    p = [Coord(0, 0) for _ in range(n)]

    for i in range(n):
        p[i].x, p[i].y = map(int, input().split())

    ans = 0
    for i in range(n):
        for j in range(n):
            for k in range(n):
                if i == j or i == k or j == k:
                    continue
                if p[i].x == p[j].x and p[i].y == p[k].y:
                    ans = max(ans, abs(p[i].y - p[j].y) * abs(p[i].x - p[k].x))
    print(ans)

if __name__ == "__main__":
    main()