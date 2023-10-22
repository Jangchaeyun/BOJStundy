import java.util.Scanner;

public class B8974 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10001];
        int k = 1;
        int a, b;
        int sum = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();

        int i = 1;
        while (i <= 1000) {
            for (int j = 1; j <= k && i <= 1000; j++) {
                arr[i++] = k;
            }
            k++;
        }

        for (i = a; i <= b; i++) {
            sum += arr[i];
        }

        System.out.println(sum);

        scanner.close();
    }
}
