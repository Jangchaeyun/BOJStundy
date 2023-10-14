import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class B14471 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] card = new int[M][2];
        int cnt = 0;

        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if (A < N) {
                card[i][0] = A;
                card[i][1] = B;
            } else {
                cnt++;
            }
        }

        Arrays.sort(card, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[0], a[0]);
            }
        });

        int result = 0;
        if (M - 1 == cnt) {
            System.out.println(0);
        } else {
            for (int i = 0; i < M - 1 - cnt; i++) {
                result += (N - card[i][0]);
            }
            System.out.println(result);
        }
    }
}