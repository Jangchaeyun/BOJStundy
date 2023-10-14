import java.util.Scanner;

public class B14648 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, q;
        int[] arr = new int[1004];

        n = scanner.nextInt();
        q = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int box;
            long s1 = 0;
            long s2 = 0;

            box = scanner.nextInt();

            if (box == 1) {
                int a, b;
                a = scanner.nextInt();
                b = scanner.nextInt();
                for (int j = a; j <= b; j++) {
                    s1 += arr[j];
                }
                System.out.println(s1);
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }

            if (box == 2) {
                int a, b, c, d;
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                d = scanner.nextInt();
                for (int j = a; j <= b; j++) {
                    s1 += arr[j];
                }
                for (int j = c; j <= d; j++) {
                    s2 += arr[j];
                }
                System.out.println(s1 - s2);
            }
        }

        scanner.close();
    }
}