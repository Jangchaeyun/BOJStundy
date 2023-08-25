import java.util.Scanner;

public class B19946 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 64;

        while (n % 2 == 0) {
            n /= 2;
            k--;
        }

        System.out.println(k);
    }
}