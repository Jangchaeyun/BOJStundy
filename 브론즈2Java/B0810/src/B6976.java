import java.util.Scanner;

public class B6976 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int num = scanner.nextInt();
            int ori = num;
            System.out.println(num);

            while (num >= 100) {
                int sub = num % 10;
                num /= 10;
                num -= sub;
                System.out.println(num);
            }

            if (ori % 11 == 0) {
                System.out.println("The number " + ori + " is divisible by 11.");
            } else {
                System.out.println("The number " + ori + " is not divisible by 11.");
            }

            System.out.println();
        }
    }
}