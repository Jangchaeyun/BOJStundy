import java.util.Scanner;

public class B12833 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans;

        if (c % 2 == 1) {
            ans = a ^ b;
        } else {
            ans = a;
        }

        System.out.println(ans);
    }
}