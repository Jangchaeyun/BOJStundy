import java.util.Scanner;
import java.util.regex.Pattern;

public class B6627 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            int n = Integer.parseInt(input);
            int s = sumOfDigits(n);
            int i = 11;

            while (true) {
                int t = n * i;
                if (sumOfDigits(t) == s) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
        }

        scanner.close();
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}