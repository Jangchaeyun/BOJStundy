import java.util.Scanner;

public class B25373 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n <= 28) {
            for (int i = 1; i <= 7; i++) {
                if (n <= sumRange(1, i)) {
                    System.out.println(i);
                    System.exit(0);
                }
            }
        } else {
            System.out.println((n - 29) / 7 + 8);
        }
    }

    private static int sumRange(int start, int end) {
        return (end * (end + 1)) / 2;
    }
}