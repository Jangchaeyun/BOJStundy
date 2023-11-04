import java.util.Scanner;

public class B25176 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long num = 1;
        for (int i = 1; i <= N; i++) {
            num *= i;
        }
        System.out.println(num);
    }
}