import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B12115 {
    static final int MAX = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            List<Integer> v = new ArrayList<>();
            for (int j = 0; j < M; j++) {
                v.add(scanner.nextInt());
            }

            int num = 0;
            for (int j = 0; j < N; j++) {
                boolean flag = true;
                for (int k = 0; k < M; k++) {
                    if (v.get(k) == -1) {
                        continue;
                    }
                    if (!v.get(k).equals(arr[j][k])) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}