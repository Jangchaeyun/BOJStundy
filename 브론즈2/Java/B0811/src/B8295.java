import java.util.Scanner;

public class B8295 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, p, ans;
        n = scanner.nextInt();
        m = scanner.nextInt();
        p = scanner.nextInt();
        ans = 0;

        for (int height = 1; height <= n; height++) {
            for (int width = 1; width <= m; width++) {
                int perimeter = (height + width) * 2;
                if (perimeter < p) continue;
                ans += (n - height + 1) * (m - width + 1);
            }
        }

        System.out.println(ans);
    }
}