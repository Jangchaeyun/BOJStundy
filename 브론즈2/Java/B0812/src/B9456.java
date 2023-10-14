import java.util.Scanner;

public class B9456 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int x = scanner.nextInt();
            double res = Math.pow(2.0, x) - 1;
            System.out.println(Math.round(res));
        }
    }
}