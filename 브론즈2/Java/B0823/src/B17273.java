import java.util.Scanner;

public class B17273 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, M, K;
        int[] front = new int[100];
        int[] back = new int[100];
        int[] result = new int[100];
        int sum = 0;

        N = scanner.nextInt();
        M = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            front[i] = scanner.nextInt();
            back[i] = scanner.nextInt();
            result[i] = front[i];
        }

        while (M --> 0) {
            K = scanner.nextInt();
            for (int i = 0; i < N; i++) {
                if (result[i] <= K) {
                    if (result[i] == front[i]) {
                        result[i] = back[i];
                    } else {
                        result[i] = front[i];
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            sum += result[i];
        }

        System.out.println(sum);
    }
}