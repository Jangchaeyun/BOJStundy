import java.util.Map;
import java.util.Scanner;

public class B5747 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            int tmp, m_even = 0, j_odd = 0;

            for (int i = 0; i < n; i++) {
                tmp = scanner.nextInt();
                if (tmp % 2 == 0 || tmp == 0)
                    m_even++;
            }

            for (int i = 0; i < n; i++) {
                tmp = scanner.nextInt();
                if (tmp % 2 != 0)
                    j_odd++;
            }

            System.out.println(Math.abs(m_even - j_odd));
        }
    }
}