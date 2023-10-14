import java.util.Scanner;

public class B5176 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        while (k-- > 0) {
            int p = scanner.nextInt();
            int m = scanner.nextInt();

            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = 0;
            }

            int ans = 0;
            for (int i = 1; i <= p; i++) {
                int n = scanner.nextInt();
                a[n - 1]++;
            }

            for (int i = 0; i < m; i++) {
                if (a[i] > 1) {
                    ans += a[i] - 1;
                }
            }

            System.out.println(ans);
        }

        scanner.close();
    }
}