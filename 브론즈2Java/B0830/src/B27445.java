import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class B27445 {
    static int N, M;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] ans;

    static class Triple {
        int x, y, c;

        Triple(int x, int y, int c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }
    }

    static void bfs(int x, int y, int c) {
        boolean[][] visit = new boolean[N][M];
        Queue<Triple> q = new ArrayDeque<>();
        q.add(new Triple(x, y, c));
        while (!q.isEmpty()) {
            Triple p = q.poll();
            x = p.x;
            y = p.y;
            c = p.c;
            if (c == 0) {
                ans[x][y]++;
                continue;
            }
            for (int d = 0, ix, iy; d < 4; d++) {
                ix = x + dx[d];
                iy = y + dy[d];
                if (ix >= 0 && ix < N && iy >= 0 && iy < M && !visit[ix][iy]) {
                    visit[ix][iy] = true;
                    q.add(new Triple(ix, iy, c - 1));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        ans = new int[N][M];

        for (int n = 0; n < N; n++) {
            int v = scanner.nextInt();
            bfs(n, 0, v);
        }

        for (int m = 1, v; m < M; m++) {
            v = scanner.nextInt();
            bfs(N - 1, m, v);
        }

        int x = 0, y = 0, v = 0;
        for (int n = 0; n < N; n++) {
            for (int m = 0; m < M; m++) {
                if (ans[n][m] > v) {
                    v = ans[n][m];
                    x = n + 1;
                    y = m + 1;
                }
            }
        }

        System.out.println(x + " " + y);
    }
}
