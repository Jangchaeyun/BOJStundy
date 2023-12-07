import java.util.Arrays;
import java.util.Scanner;

public class B3211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);

        int ret = 1;
        while (ret <= n && a[ret - 1] + 1 > ret) {
            ret = a[ret - 1] + 1;
        }

        System.out.println(ret);
    }
}