#include <stdio.h>
#include <string.h>

int map[101][101];
int dr[4] = { 0, 1, 0, -1 };
int dc[4] = { 1, 0, -1, 0 };

int main() {
	int M, N;
	scanf("%d %d", &M, &N);

	memset(map, 0, sizeof(map));
	int ans = 0;
	int cnt = 1;

	int d = 0;
	int r = 0;
	int c = 0;
	map[r][c] = 1;
	while (1)
	{
		if (cnt == M * N)
			break;

		int nr = r + dr[d];
		int nc = c + dc[d];

		if (nr < 0 || nr > M - 1 || nc < 0 || nc > N - 1 || map[nr][nc] == 1) {
			ans += 1;
			if (d == 3)
				d = 0;
			else
				d = d + 1;
		}
		else {
			map[nr][nc] = 1;
			cnt += 1;
			r = nr;
			c = nc;
		}
	}
	printf("%d", ans);

	return 0;
}