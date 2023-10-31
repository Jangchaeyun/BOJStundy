import java.util.Scanner;

public class B18268 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] ranking = new int[11][21];

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                int r = scanner.nextInt();
                ranking[i][r] = j;
            }
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                boolean ok = true;
                for (int k = 0; k < K; k++) {
                    if (ranking[k][i] > ranking[k][j]) ok = false;
                }
                if (ok) ans++;
            }
        }

        System.out.println(ans);
    }
}