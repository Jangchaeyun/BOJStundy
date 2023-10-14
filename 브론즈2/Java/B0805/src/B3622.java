import java.util.Scanner;

public class B3622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int a = scanner.nextInt();
        int B = scanner.nextInt();
        int b = scanner.nextInt();
        int P = scanner.nextInt();
        boolean c = false;

        if (A + B <= P)
            c = true;
        else if (a >= B && P >= A)
            c = true;
        else if (A <= b && P >= B)
            c = true;

        System.out.println(c ? "Yes" : "No");
    }
}