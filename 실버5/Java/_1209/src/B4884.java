import java.util.Map;
import java.util.Scanner;

public class B4884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            long g = scanner.nextLong();
            long t = scanner.nextLong();
            long a = scanner.nextLong();
            long d = scanner.nextLong();

            if (g == -1 && t == -1 && a == -1 && d == -1) {
                break;
            }

            long to_num = g * a + d;

            for (long i = 1; i < to_num; i++) {
                if (Math.pow(2, i) == to_num) {
                    break;
                }
                if (Math.pow(2, i) > to_num) {
                    to_num = (long) Math.pow(2, i);
                    break;
                }
            }

            long to = to_num - 1;
            long jo = (t * (t - 1) / 2) * g;

            long x = jo + to;
            long y = 0;
            if (d > 0) {
                y = to_num - (g * a + d);
            }

            System.out.printf("%d*%d/%d+%d=%d+%d\n", g, a, t, d, x, y);
        }
    }
}