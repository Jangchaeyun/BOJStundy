import java.util.Scanner;

public class B5956 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int ans = 0;
        int r = 1;

        while (n % 2 == 1 && m % 2 == 1) {
            ans += r;
            n /= 2;
            m /= 2;
            r *= 4;
        }

        System.out.println(ans);
    }
}