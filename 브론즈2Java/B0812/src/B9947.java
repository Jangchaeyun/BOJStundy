import java.util.Scanner;

public class B9947 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a, b;
        int aScore, bScore, n;

        while (true) {
            a = scanner.next();
            b = scanner.next();

            if (a.equals("#") && b.equals("#")) {
                break;
            }

            n = scanner.nextInt();
            aScore = bScore = 0;

            while (n-- > 0) {
                char c1 = scanner.next().charAt(0);
                char c2 = scanner.next().charAt(0);
                if (c1 == c2) {
                    aScore++;
                } else {
                    bScore++;
                }
            }

            System.out.println(a + " " + aScore + " " + b + " " + bScore);
        }
    }
}