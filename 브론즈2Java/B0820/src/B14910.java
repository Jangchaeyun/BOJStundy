import java.io.IOException;
import java.util.Scanner;

public class B14910 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        boolean sign = false;
        int temp = -214700000;

        while (sc.hasNextInt()) {
            int a = sc.nextInt();

            if (temp <= a) {
                temp = a;
                continue;
            } else {
                sign = true;
                System.out.println("Bad");
                break;
            }
        }

        if (!sign)
            System.out.println("Good");
    }
}