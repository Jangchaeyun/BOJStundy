import java.util.Arrays;
import java.util.Scanner;

public class B13771 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] a = new float[101];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextFloat();
        }

        Arrays.sort(a, 0, n);

        System.out.printf("%.2f", a[1]);
    }
}