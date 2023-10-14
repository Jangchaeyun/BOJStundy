import java.util.Scanner;

public class B4623 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int A, B, C, D;
            A = scanner.nextInt();
            B = scanner.nextInt();
            C = scanner.nextInt();
            D = scanner.nextInt();

            if (A == 0 && B == 0 && C == 0 && D == 0) {
                break;
            }

            if (A < B) {
                int temp = A;
                A = B;
                B = temp;
            }

            if (C < D) {
                int temp = C;
                C = D;
                D = temp;
            }

            int start = 1, end = 100;
            int result = 0;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (A * mid <= C * 100 && B * mid <= D * 100) {
                    start = mid + 1;
                    result = mid;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println(result + "%");
        }

        scanner.close();
    }
}