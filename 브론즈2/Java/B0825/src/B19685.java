import java.util.Scanner;

public class B19685 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int f = scanner.nextInt();

        for (int i = s; i <= f; i++) {
            if (isPalindrome(i)) {
                System.out.println("Palindrome!");
            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedNumStr);
    }
}