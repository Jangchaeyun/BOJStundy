import java.util.Scanner;

public class B13420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            String op = scanner.next();
            long b = scanner.nextLong();
            String t = scanner.next();
            long c = scanner.nextLong();
            long ans = 0;
            if (op.equals("+"))
                ans = a + b;
            else if (op.equals("-"))
                ans = a - b;
            else if (op.equals("*"))
                ans = a * b;
            else if (op.equals("/"))
                ans = a / b;
            t = ans == c ? "correct" : "wrong answer";
            System.out.println(t);
        }
    }
}