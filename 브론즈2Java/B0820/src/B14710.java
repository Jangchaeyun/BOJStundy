import java.util.Scanner;

public class B14710 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;
        int z;

        x = scanner.nextInt();
        y = scanner.nextInt();

        z = x % 30;

        if (z * 12 == y) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }

        scanner.close();
    }
}