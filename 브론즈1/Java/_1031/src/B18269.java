import java.util.Scanner;

public class B18269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        for (int k = 1; k <= n; k++) {
            boolean ok = true;
            for (int i = 0; i <= n - k; i++) {
                String tmp = s.substring(i, i + k);
                for (int j = 0; j <= n - k; j++) {
                    if (i == j) continue;
                    if (tmp.equals(s.substring(j, j + k))) {
                        ok = false;
                        break;
                    }
                }
                if (!ok) break;
            }
            if (ok) {
                System.out.println(k);
                return;
            }
        }
    }
}