import java.util.Scanner;

public class B16485 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        int b = scanner.nextInt();

        int result = Math.max(c, b) / Math.min(c, b);
        System.out.println(result);

        scanner.close();
    }
}
