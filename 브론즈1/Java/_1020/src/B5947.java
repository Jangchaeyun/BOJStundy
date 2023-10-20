import java.util.Scanner;

public class B5947 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int p = scanner.nextInt();

        int[][] a = new int[n + 1][q + 1];
        int[] check = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= q; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < p; i++) {
            int qj = scanner.nextInt();
            int aj = scanner.nextInt();

            for (int j = 1; j <= n; j++) {
                if (a[j][qj] == aj) {
                    check[j]++;
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (check[i] == p) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}