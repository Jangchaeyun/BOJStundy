import java.util.Scanner;

public class B14915 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tmp = "0123456789ABCDEF";

        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();

        if (n == 0) {
            System.out.print("0");
            return;
        }

        StringBuilder str = new StringBuilder();
        while (n > 0) {
            str.append(tmp.charAt(n % m));
            n /= m;
        }

        System.out.print(str.reverse().toString());

        scanner.close();
    }
}