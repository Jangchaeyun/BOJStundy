import java.util.Scanner;

public class B24049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] graph = new int[n + 1][m + 1];
        int[] col = new int[n];
        int[] row = new int[m];

        for (int i = 0; i < n; i++) {
            col[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            row[i] = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            graph[i][0] = col[i - 1];
        }

        for (int j = 1; j <= m; j++) {
            graph[0][j] = row[j - 1];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                graph[i][j] = graph[i][j - 1] ^ graph[i - 1][j];
            }
        }

        System.out.println(graph[n][m]);
    }
}