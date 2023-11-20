def flip(grid, N, i, j):
    global cnt
    for a in range(i, -1, -1):
        for b in range(j, -1, -1):
            if grid[a][b] == 1:
                grid[a][b] = 0
            else:
                grid[a][b] = 1
    cnt += 1

def main():
    global cnt
    cnt = 0
    N = int(input())
    arr = [[0] * 10 for _ in range(10)]

    for i in range(N):
        arr[i] = list(map(int, input().split()))

    for i in range(N - 1, -1, -1):
        for j in range(N - 1, -1, -1):
            if arr[i][j] == 1:
                flip(arr, N, i, j)

    print(cnt)

if __name__ == "__main__":
    main()
