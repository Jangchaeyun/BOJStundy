import java.util.Scanner;

public class B13877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int a = 0; a < t; a++) {
            String[] input = scanner.nextLine().split(" ");
            String i = input[0];
            String n = input[1];

            int o = (maxDigit(n) < '8') ? Integer.parseInt(n, 8) : 0;

            System.out.println(Integer.parseInt(i) + " " + o + " " + Integer.parseInt(n) + " " + Integer.parseInt(n, 16));
        }
    }

    private static char maxDigit(String s) {
        char max = '0';
        for (char c : s.toCharArray()) {
            if (c > max) {
                max = c;
            }
        }
        return max;
    }
}