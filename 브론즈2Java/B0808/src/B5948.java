import java.util.Scanner;

public class B5948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] v = new int[10001];
        int ans = 0;

        while (v[n] == 0) {
            v[n] = 1;
            n = n / 100 % 10 * 10 + n / 10 % 10;
            n *= n;
            ans++;
        }

        System.out.println(ans);
    }
}