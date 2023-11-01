import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18868 {
    static int[][] bus;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        bus = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                bus[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        for (int k = 0; k < M - 1; k++) {
            a:for(int i = k + 1; i < M; i++) {
            for (int r = 0; r < N - 1; r++) {
                for (int c = r + 1; c < N; c++) {
                    if (!check(k, i, r, c)) {
                        continue a;
                    }
                }
            }
            cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean check(int k, int i, int r, int c) {
        return (bus[k][r] == bus[k][c] && bus[i][r] == bus[i][c]) || (bus[k][r] > bus[k][c] && bus[i][r] > bus[i][c])
                || (bus[k][r] < bus[k][c] && bus[i][r] < bus[i][c]);
    }
}
