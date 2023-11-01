import java.util.Scanner;

public class B20170 {
    public static void main(String[] args) {
        int[] dice_A = new int[6];
        int[] dice_B = new int[6];

        Scanner input = new Scanner(System.in);

        int numerator = 0;
        int denominator = 36;
        int _gcd;

        for (int i = 0; i < 6; i++) {
            dice_A[i] = input.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            dice_B[i] = input.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (dice_A[i] > dice_B[j]) {
                    numerator++;
                }
            }
        }

        _gcd = gcd(denominator, numerator);

        System.out.printf("%d/%d", numerator / _gcd, denominator / _gcd);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
