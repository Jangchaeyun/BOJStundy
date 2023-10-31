import java.util.Scanner;

public class B17520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int ans = 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            ans *= 2;
            ans %= 16769023;
        }

        System.out.println(ans);
    }
}