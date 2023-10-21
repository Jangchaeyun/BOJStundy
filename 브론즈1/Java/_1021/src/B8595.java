import java.util.List;
import java.util.Scanner;

public class B8595 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        char[] input = scanner.nextLine().toCharArray();
        String temp = "";
        long sum = 0;

        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (Character.isDigit(c)) {
                temp += c;
            } else if (Character.isLetter(c)) {
                if (!temp.isEmpty()) {
                    sum += Long.parseLong(temp);
                    temp = "";
                }
            }
        }

        if (!temp.isEmpty()) {
            sum += Long.parseLong(temp);
        }

        System.out.println(sum);
    }
}
