import java.util.Scanner;

public class B16756 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[100000];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int min = Math.abs(A[1] - A[0]);

        for (int i = 0; i < N - 1; i++) {
            if (Math.abs(A[i + 1] - A[i]) <= min) {
                min = Math.abs(A[i + 1] - A[i]);
            }
        }
        System.out.println(min);
    }
}