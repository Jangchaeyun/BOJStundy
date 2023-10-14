import java.util.Scanner;

public class B6930 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int div = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < div; i++) {
            if ((num * i) % div == 1) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No such integer exists.");
        }

        scanner.close();
    }
}