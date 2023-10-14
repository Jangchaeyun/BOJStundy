import java.util.Scanner;

public class B8246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, k;
        a = scanner.nextInt();
        b = scanner.nextInt();
        k = scanner.nextInt();
        System.out.println((a / k) * (b / k) - Math.max(0, a / k - 2) * Math.max(0, b / k -2));
    }
}