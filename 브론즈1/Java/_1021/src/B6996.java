import java.util.Arrays;
import java.util.Scanner;

public class B6996 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            String[] input = scanner.nextLine().split(" ");
            String a = input[0];
            String b = input[1];

            char[] x = a.toCharArray();
            char[] y = b.toCharArray();

            Arrays.sort(x);
            Arrays.sort(y);

            if (Arrays.equals(x, y)) {
                System.out.printf("%s & %s are anagrams.%n", a, b);
            } else {
                System.out.printf("%s & %s are NOT anagrams.%n", a, b);
            }
        }

        scanner.close();
    }
}