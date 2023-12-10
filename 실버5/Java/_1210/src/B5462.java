import java.util.Scanner;

public class B5462 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int p = scanner.nextInt();

        int[][] a = new int[n][t];
        int[][] r = new int[n][2];
        int[] s = new int[t];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                a[i][j] = scanner.nextInt();
                if (a[i][j] == 0) {
                    s[j]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                if (a[i][j] == 1) {
                    r[i][0] += s[j];
                    r[i][1]++;
                }
            }
        }

        int k1 = r[p - 1][0];
        int k2 = r[p - 1][1];
        int c = 1;

        for (int i = 0; i < n; i++) {
            if (r[i][0] > k1) {
                c++;
            } else if (r[i][0] == k1 && r[i][1] > k2) {
                c++;
            } else if (r[i][0] == k1 && r[i][1] == k2 && i + 1 < p) {
                c++;
            }
        }

        System.out.println(k1 + " " + c);
    }
}