import java.util.Scanner;

public class B23885 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int ex = scanner.nextInt();
        int ey = scanner.nextInt();

        if (N == 1 || M == 1) {
            if (sx == ex && sy == ey) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (sx % 2  == sy % 2) {
            if (ex % 2 == sy % 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (sx % 2 != sy % 2) {
            if (ex % 2 == ey % 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}