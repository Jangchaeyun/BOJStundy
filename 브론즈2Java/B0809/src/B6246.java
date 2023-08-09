import java.util.ArrayList;
import java.util.Scanner;

public class B6246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        ArrayList<Boolean> line = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            line.add(false);
        }

        while (Q-- > 0) {
            int L = scanner.nextInt();
            int I = scanner.nextInt();

            for (int i = L - 1; i < N; i+= I) {
                line.set(i, true);
            }
        }

        int ans = 0;
        for (boolean it : line) {
            if (!it) {
                ans++;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}