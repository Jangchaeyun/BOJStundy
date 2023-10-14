import java.util.Scanner;

public class B21412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i =  n / 2 + 1;  i < n; i++) {
            int gcd = GCD(i, n - i);
            if (gcd == 1) {
                System.out.println(n - i + " " + i);
                break;
            }
        }
    }

    static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
}
