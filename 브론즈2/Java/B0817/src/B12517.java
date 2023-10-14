import java.util.Scanner;

public class B12517 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= t; i++) {
            String text = scanner.nextLine().trim();
            String ruling;

            if (text.endsWith("y")) {
                ruling = "nobody.";
            } else if (text.endsWith("a") || text.endsWith("e") || text.endsWith("i") || text.endsWith("o") || text.endsWith("u")) {
                ruling = "a queen.";
            } else {
                ruling = "a king.";
            }

            System.out.println("Case #" + i + ": " + text + " is ruled by " + ruling);
        }

        scanner.close();
    }
}