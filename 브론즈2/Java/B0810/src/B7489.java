import java.util.Scanner;

public class B7489 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int target = scanner.nextInt();
            int number = 1;

            for (int k = 2; k <= target; k++) {
                number *= k;

                while (number % 10 == 0) {
                    number /= 10;
                }
                number %= 10000;
            }

            System.out.println(number % 10);
        }
    }
}