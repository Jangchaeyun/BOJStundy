import java.util.Scanner;

public class B14614 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = scanner.next();

        if ((c.charAt(c.length() - 1) - '0') % 2 == 0) {
            System.out.println(a);
        } else {
            int ans = a ^ b;
            System.out.println(ans);
        }
    }
}