import java.util.Scanner;

public class B3553 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();

        String tString = Integer.toString(t);
        int p = tString.length();

        if (n < p) {
            System.out.println("No solution");
        } else {
            System.out.println(t + "0".repeat(n - p));
        }
    }
}
